package com.givon.apktool.cli;

import com.givon.apktool.GXLog;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ApkDecoderAj {
    @Before("execution(void brut.androlib.ApkDecoder.decode())")
    public void decode_before(){
        GXLog.i("decode_before");
    }
}
