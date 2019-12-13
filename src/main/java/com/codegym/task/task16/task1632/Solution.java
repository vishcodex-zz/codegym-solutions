package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//// **** STILL SOLUTION INCOMPLETE

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {
        threads.add(new Thread(new IndefiniteThread()));
        threads.add(new Thread(new InterruptedExceptionThread()));
        threads.add(new Thread(new HurrayThread()));
        threads.add(new Thread(new MessageThread()));
        threads.add(new Thread(new ReadNumberThread()));
    }

    public static void main(String[] args) {
    }



    public static class IndefiniteThread implements Runnable {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class InterruptedExceptionThread implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e.getClass().getSimpleName());
            }
        }
    }

    public static class HurrayThread implements Runnable {
        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    System.out.println("Hurray");
                    Thread.sleep(500);
                }
            } catch (InterruptedException ignored) {
            }
        }
    }

    public static class MessageThread extends Thread implements Message {
        private volatile boolean flag = true;
        @Override
        public void showWarning() {

        }

        @Override
        public void run() {
            while (!isInterrupted())
            {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static class ReadNumberThread implements Runnable {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        @Override
        public void run() {
            while (true){
                String num = null;
                try {
                    num = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(num.equals("N")){

                    System.out.println(sum);
                    break;
                }
                else {
                    sum+=(Integer.parseInt(num));
                }
            }
        }
    }
}