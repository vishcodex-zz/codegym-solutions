package com.codegym.task.task14.task1419;


import java.util.ArrayList;
import java.util.List;

/*
Exception invasion
1. The list exceptions must contain 10 elements.
2. All items in the list exceptions must be exceptions (descendants of the Throwable class).
3. All items in the list exceptions must be unique.
4. The initExceptions method must be static.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new IllegalStateException());
        exceptions.add(new UnsupportedOperationException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new ClassCastException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new RuntimeException());
        // exceptions.add(new SecurityException());
        // exceptions.add(new ArrayIndexOutOfBoundsException());

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }

    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;
        }
        //write your code
        catch (Exception e) {
            exceptions.add(e);
        }

    }
}
