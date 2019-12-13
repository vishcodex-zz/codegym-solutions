package com.codegym.task.task18.task1816;

/*
ABCs

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException,IOException {
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = args[0];
        FileInputStream f = new FileInputStream(file);
        int l;
        int count=0;
        try {

            while (f.available() > 0 ) {
                l = f.read();
                if(Character.isLetter(l)) count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        f.close();
        System.out.println(count);
    }
}