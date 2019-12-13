package com.codegym.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int A;
    public static int B;

    public static final int MIN = min(A, B);

    static{
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Solution.A = Integer.parseInt(reader.readLine());
            Solution.B = Integer.parseInt(reader.readLine());
            reader.close();
        }
        catch (IOException e){

        }
    }


    public static void main(String[] args) {
        int m = min(A,B);
        System.out.println(m);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}