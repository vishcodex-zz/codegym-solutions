package com.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/*
A list and some threads

*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //write your code here
        SpecialThread s = new SpecialThread();
        Thread t = new Thread(s);
        list.add(t);
        SpecialThread s1 = new SpecialThread();
        Thread t1 = new Thread(s1);
        list.add(t1);
        SpecialThread s2 = new SpecialThread();
        Thread t2 = new Thread(s2);
        list.add(t2);
        SpecialThread s3 = new SpecialThread();
        Thread t3 = new Thread(s3);
        list.add(t3);
        SpecialThread s4 = new SpecialThread();
        Thread t4 = new Thread(s4);
        list.add(t4);
//        for(int i=0;i<list.size();i++)
//        {
//            SpecialThread s = new SpecialThread();
//            Thread t = new Thread(s);
//            list.add(t);
//        }

        for(Thread i : list)
            System.out.println(i);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}
