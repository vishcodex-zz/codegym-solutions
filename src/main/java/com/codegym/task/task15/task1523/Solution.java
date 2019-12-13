package com.codegym.task.task15.task1523;

/*
Overloading constructors

*/

public class Solution {
    public static int number;
    public static float num;
    public static String name;
    public static double d;

    public static void main(String[] args) {

    }

    public Solution() {
    }

    private Solution(int number) {
        this.number = number;
    }

    Solution(double d) {
        this.d = d;
    }

    protected Solution(String name) {
        this.name = name;
    }


}

