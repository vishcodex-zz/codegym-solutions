package com.codegym.task.task15.task1517;

/*
Static modifiers and exceptions
*/

public class Solution {
    public static int A = 0;

    static {
        // Throw an exception here
        System.out.println(1/A);
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}