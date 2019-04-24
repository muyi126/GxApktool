package com.givon.apktool.lib;

import brut.androlib.Androlib;
import brut.androlib.meta.UsesFramework;
import com.givon.apktool.GXLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


import java.io.File;

@Aspect
public class AndrolibAj {

    @Around("execution (* brut.androlib.Androlib.buildResourcesFull(..))" +
            "&& args(appDir,usesFramework)")
    public boolean buildResourcesFull_around(ProceedingJoinPoint joinPoint, File appDir, UsesFramework usesFramework) throws Throwable {
        GXLog.i("buildResourcesFull_around before");
        Androlib thiz = (Androlib) joinPoint.getThis();
        //TODO error: No resource identifier found for attribut  aapt error
        Boolean proceed = (Boolean) joinPoint.proceed(joinPoint.getArgs());
        GXLog.i("buildResourcesFull_around after");
        return proceed;
    }
}
