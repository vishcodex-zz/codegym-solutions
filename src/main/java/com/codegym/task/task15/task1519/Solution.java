package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            s = reader.readLine().trim().replaceAll("\\s+", "");
            // print(s);
            if (s.equals("exit")) break;
            try {
                if (s.contains(".") && isDouble(s)) {
                    Double d = Double.parseDouble(s);
                    print(d);
                } else if (isShort(s) && Short.parseShort(s) > 0 && Short.parseShort(s) < 128) {
                    short sh = Short.parseShort(s);
                    print(sh);
                } else if (isInteger(s) && Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) {
                    Integer integ = Integer.parseInt(s);
                    print(integ);
                } else {
                    print(s);
                }
            } catch (NumberFormatException n) {
                print(s);
            }

        }
    }

    public static boolean isDouble(String s) {
        try {
            Double d = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException n) {
            return false;
        }
    }

    public static boolean isShort(String s) {
        try {
            short sh = Short.parseShort(s);
            return true;
        } catch (NumberFormatException n) {
            return false;
        }
    }

    public static boolean isInteger(String s) {
        try {
            Integer integ = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException n) {
            return false;
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
