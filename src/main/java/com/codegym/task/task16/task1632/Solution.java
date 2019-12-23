package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new thread1()));
        threads.add(new Thread(new thread2()));
        threads.add(new Thread(new thread3()));
        threads.add(new thread4());
        threads.add(new Thread(new thread5()));
    }

    public static void main(String[] args) {
    }

    public static class thread1 implements Runnable {

        @Override
        public void run() {
            while (true) ;
        }
    }

    public static class thread2 implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class thread3 implements Runnable {

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    System.out.println("Hurray");
                    Thread.sleep(500);
                }
            } catch (Exception e) {
            }
        }
    }

    public static class thread4 extends Thread implements Message{
        private boolean isWarned = false;
        @Override
        public void showWarning() {
            interrupt();
        }
        @Override
        public void run() {
            while (!isInterrupted()) { }
        }
    }

    public static class thread5 implements Runnable {

        @Override
        public void run() {
            int sum = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                while (true) {
                    String inputString = reader.readLine();
                    if (inputString.equals("N")) {
                        break;
                    }
                    sum += Integer.parseInt(inputString);
                }
                System.out.println(sum);
            } catch (IOException e) {
            }
        }
    }
}