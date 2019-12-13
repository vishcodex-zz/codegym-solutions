package com.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


//// INCOMPLETE ANSWER...

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static volatile AtomicInteger prntcount = new AtomicInteger(0);
    public static ArrayList<String> arrlist = new ArrayList<String>();
 //   public static String str[] = new String[5];

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        //write your code here
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    //    str = arrlist.toArray(str);
        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        public void run() {
            try {
                    arrlist.add(reader.readLine());
                arrlist.add(reader.readLine());
                arrlist.add(reader.readLine());
            } catch (Exception e) {
            }
        }

        public void printResult() {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrlist.get(j) + " ");
                prntcount.incrementAndGet();
            }
            System.out.println();
        }
    }
}