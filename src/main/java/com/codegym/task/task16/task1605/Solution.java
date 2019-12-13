package com.codegym.task.task16.task1605;

import java.util.Date;

/*
Let's talk music
*/

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Violin v = new Violin("Player");
        Thread violin = new Thread(v);
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        @Override
        public void run() {
            long t1 =  startPlaying().getTime();
            sleepNSeconds(1);
            long t2 = stopPlaying().getTime();
            long totalTime = t2- t1;
            System.out.println("Played for " + totalTime + " ms");
        }

        public Date startPlaying() {
           System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }
    }
}
