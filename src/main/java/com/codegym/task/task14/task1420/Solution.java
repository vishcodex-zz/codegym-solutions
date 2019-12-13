package com.codegym.task.task14.task1420;

/*
GCD

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
        int a = Integer.parseInt(reader.readLine());      // Hint:  Make sure "0" also included in the condition
        if (a <= 0 ) throw new NumberFormatException("Number needs to be positive");
        int b = Integer.parseInt(reader.readLine());
        if (b <= 0 ) throw new NumberFormatException("Number needs to be positive");

        System.out.println(gcd (a,b));

//        }
//        catch (NumberFormatException e)
//        {
//            e.printStackTrace();
//
//        }

    }

    public static int gcd(int x, int y){
        return (y == 0) ? x : gcd(y, x % y);
    }
}
