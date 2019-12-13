package com.codegym.task.task15.task1513;

/*
The simplest code: part 3

*/

public class Solution {
    public static void main(String[] args) {
//        Machine m = new Machine("Vishnu");
//        System.out.println(m.toString());
    }

    public interface Runnable {

    }

    public static class Machine implements Runnable {
        public String name;
        public Machine(String name) {
        //    super();
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public class Car extends Machine {
        public Car(String name) {
            super(name);
        }
    }
}