package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f = br.readLine();
        FileInputStream fi = new FileInputStream(f);
        long sum =0;
        while (fi.available() > 0)
        {
            int data = fi.read();
            if(data>sum)
                sum=data;
        }
        System.out.println(sum);
        fi.close();
    }
}
