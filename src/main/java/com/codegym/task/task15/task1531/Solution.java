package com.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/*
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

            System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        boolean isNegative = false;
        String res = "";
        if(n < 0) {
            isNegative = true;
            return "0";
        }
        BigInteger num=BigInteger.valueOf(n);

        if(isNegative) {
            res = "-" + fact(num).toString();
        }else
            res = fact(num).toString();
        return res;
    }

    public static BigInteger fact(BigInteger num) {
        if (num.compareTo((new BigInteger("1"))) ==  -1) {
            return new BigInteger("1");
        } else {
            return (num.multiply(fact(num.subtract(new BigInteger("1")))));
        }
    }
}
