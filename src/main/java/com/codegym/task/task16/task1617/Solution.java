package com.codegym.task.task16.task1617;

/*
Countdown at the races

*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //write your code here
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();

        }

        public void run() {
            //write your code here
            try{
                boolean isThree = false;
                while (numSeconds > 0){
                    if (numSeconds == 3)
                    {
                        isThree = true;
                    }
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);

                }
                if (isThree){
                    System.out.print("Go!");
                }
            }
            catch (InterruptedException e) {
                System.out.print("Interrupted!");
            }
        }
    }
}
