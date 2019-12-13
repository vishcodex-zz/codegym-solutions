package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Mastering the static block
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //write your code here
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            if(s.toLowerCase().equals("helicopter"))
            {
                result = new Helicopter();
            }
            else if (s.toLowerCase().equals("plane"))
            {
                result = new Plane(10);
            }
            System.out.println("Result is:" + result);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
