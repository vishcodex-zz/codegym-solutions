package com.codegym.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new CountdownRunnable(), "Decrease").start();
        Thread t1 = new Thread(new CountUpRunnable(), "Increase");
        t1.start();


    }

    public static class CountUpRunnable implements Runnable{
        //write your code here
        private int countUpIndex = 1;

        public void run() {

            try {
                while (true) {
                    System.out.println(toString());
                    countUpIndex += 1;
                    Thread.sleep(500); // Answer lies in this line!
                    if (countUpIndex == Solution.number+1) return;
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countUpIndex;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countdownIndex = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countdownIndex -= 1;
                    if (countdownIndex == 0) return;
                    Thread.sleep(2500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countdownIndex;
        }
    }


}