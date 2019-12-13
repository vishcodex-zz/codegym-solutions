package com.codegym.task.task14.task1421;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){
//        instance = new Singleton();

    }

    public static Singleton getInstance()
    {
        return instance;
    }

}