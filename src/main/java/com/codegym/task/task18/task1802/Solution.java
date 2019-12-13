package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f = br.readLine();
        FileInputStream fi = new FileInputStream(f);
        long sum = Long.MAX_VALUE;
        System.out.println("old sum"+sum);
        while (fi.available() > 0)
        {
            int data = fi.read();
            if(data<sum)
                sum=data;
        }
        System.out.println(sum);
        fi.close();
    }
}
