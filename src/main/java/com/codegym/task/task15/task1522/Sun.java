package com.codegym.task.task15.task1522;

//public class Sun implements Planet {
//    private static Sun instance;
//
//    private Sun() {}
//    static {
//        try {
//            instance = new Sun();
//        } catch (Exception e) {
//            throw new RuntimeException("Exception occured in creating singleton instance");
//        }
//    }
//
//    public static Sun getInstance() {
//        return instance;
//    }

public class Sun implements Planet {
    private static Sun instance;
    private Sun() {}



    public static Sun getInstance() {
        if (instance == null) instance = new Sun();
        return instance;
    }
}