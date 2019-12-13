package com.codegym.task.task18.task1817;

/*
Spaces
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {

        String filename = args[0];
        FileInputStream f = new FileInputStream(filename);
        int n1=f.available();
        int n2=0;
        while(f.available() > 0)
        {
            int r = f.read();
            if(r == 32) n2++;
           // if(Character.isSpaceChar(r)) n1++;
           // if(!Character.isSpaceChar(r)) n2++;
           // if(Character.isDigit(r)) n2++;
        }
        f.close();
        double score = (double) n2/n1*100;
        System.out.println(Math.round(score*100.0)/100.0);
    }
}