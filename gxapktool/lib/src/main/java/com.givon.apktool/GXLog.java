package com.givon.apktool;

public class GXLog {
    private static final int LEVEL = 4;

    public static void e(String msg) {
        if (LEVEL < 1) {
            return;
        }
        System.out.println("[ERROR] " + msg);
    }

    public static void w(String msg) {
        if (LEVEL < 2) {
            return;
        }
        System.out.println("[WARNING] " + msg);
    }

    public static void i(String msg) {
        if (LEVEL < 3) {
            return;
        }
        System.out.println("[INFO] " + msg);
    }

    public static void d(String msg) {
        if (LEVEL < 4) {
            return;
        }
        System.out.println("[DEBUG] " + msg);
    }
}
