package com.codegym.task.task18.task1807;

/*
Counting commas

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(in.readLine());
        //BufferedReader f = new BufferedReader(new InputStreamReader(file));
        int s;
        int count = 0;

        while (file.available() > 0 ) {
            s = file.read();
                if ( s == 44)
                    count++;
        }
        System.out.println(count);
        in.close();
        file.close();
    }
}
