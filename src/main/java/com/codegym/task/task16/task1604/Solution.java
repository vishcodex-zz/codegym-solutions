package com.codegym.task.task16.task1604;

/*
Displaying a stack trace

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        SpecialThread s = new SpecialThread();
        Thread thread = new Thread(s);
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {
        public SpecialThread() {
        }

        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
