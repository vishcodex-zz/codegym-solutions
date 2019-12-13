package com.codegym.task.task17.task1715;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static DrugController drugController = new DrugController();
    public static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread pharmacy = new Thread(new Pharmacy());
        Thread man = new Thread(new Person(), "Man");
        Thread woman = new Thread(new Person(), "Woman");

        pharmacy.start();
        man.start();
        woman.start();

        Thread.sleep(1000);
        isStopped = true;
    }

    public static class Pharmacy implements Runnable {

        public void run() {

            while (!isStopped) {

                drugController.buy(getRandomDrug(), getRandomCount());
                for(int i = 0; i < 3; i++)
                    waitAMoment();
            }
        }
    }

    public static class Person implements Runnable {

        public void run() {

            while (!isStopped) {

                drugController.sell(getRandomDrug(), getRandomCount());
                waitAMoment();
            }
        }
    }

    public static int getRandomCount() {
        return (int) (Math.random() * 3) + 1;
    }

    public static Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (drugController.allDrugs.size()));
        List<Drug> drugs = new ArrayList<Drug>(drugController.allDrugs.keySet());
        System.out.println("Drugs value is: " + drugs);
        return drugs.get(index);
    }


    private static void waitAMoment() {
            try {
                    Thread.sleep(100);
            } catch (InterruptedException ignored) {
        }
    }
}
