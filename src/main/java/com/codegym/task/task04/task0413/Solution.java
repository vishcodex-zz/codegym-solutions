package com.codegym.task.task04.task0413;

/*
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number == 1)
            System.out.println("Monday");
        else if (number == 2)
            System.out.println("Tuesday");
        else if (number == 3)
            System.out.println("Wednesday");
        else if (number == 4)
            System.out.println("Thursday");
        else if (number == 5)
            System.out.println("Friday");
        else if (number == 6)
            System.out.println("Saturday");
        else if (number == 7)
            System.out.println("Sunday");
        else
            System.out.println("No such day of the week");
    }
}