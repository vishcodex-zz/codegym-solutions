package com.codegym.task.task15.task1522;

//public class Earth implements Planet {
//    private static Earth instance;
//
//    private Earth() {}
//    static {
//        try {
//            instance = new Earth();
//        } catch (Exception e) {
//            throw new RuntimeException("Exception occured in creating singleton instance");
//        }
//    }
//
//    public static Earth getInstance() {
//        return instance;
//    }
//}

public class Earth implements Planet {
    private static Earth instance;
    private Earth() {}



    public static Earth getInstance() {
        if (instance == null) instance = new Earth();
        return instance;
    }
}