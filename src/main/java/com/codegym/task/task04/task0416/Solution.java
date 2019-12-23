package com.codegym.task.task04.task0416;

/*
Crossing the road blindly

*/

import java.io.*;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.valueOf(reader.readLine());
        double roundN = Math.floor(t);
        double lightTime =  roundN % 5;

        if (lightTime >= 0 && lightTime <3 ){
            System.out.println("green");
        }else if (lightTime >= 3 && lightTime < 4 ){
            System.out.println("yellow");
        }else{
            System.out.println("red");
        }


    }
}