package com.packt.springboot.restintro;

public class Util {

    public static String getCurrentMethodName() {
        return getCurrentMethodName(0);
    }
    public static String getCurrentMethodName(int level) {
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[level]
                .getMethodName();
        return nameofCurrMethod;
    }
}
