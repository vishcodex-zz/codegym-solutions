package com.codegym.task.task09.task0907;

/*
Exception when working with numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception,ArithmeticException {
        //write your code here

        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ArithmeticException");
        }

        //write your code here
    }
}
