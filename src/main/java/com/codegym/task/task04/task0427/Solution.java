package com.codegym.task.task04.task0427;

/*
Describing numbers
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        if (num >0 && num < 10) {
            if (num % 2 == 0) {
                System.out.println("even single-digit number");
            } else {
                System.out.println("odd single-digit number");
            }
        } else if (num > 9 && num < 100) {
            if (num % 2 == 0) {
                System.out.println("even two-digit number");
            } else {
                System.out.println("odd two-digit number");
            }
        } else if (num > 99 && num < 1000) {
            if (num % 2 == 0) {
                System.out.println("even three-digit number");
            } else {
                System.out.println("odd three-digit number");
            }
        }
    }
}
