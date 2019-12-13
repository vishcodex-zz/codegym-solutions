package com.codegym.task.task18.task1820;

/*
Rounding numbers
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();

            FileInputStream inputStream1 = new FileInputStream(file1);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
