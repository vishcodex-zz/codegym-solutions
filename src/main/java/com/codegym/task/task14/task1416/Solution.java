package com.codegym.task.task14.task1416;

/*
Fixing bugs

*/

import com.sun.org.apache.xpath.internal.operations.Or;

public class Solution {
    public static void main(String[] args) {
        CanSwim creature = new Orca();
        creature.swim();
        creature = new Whale();
        creature.swim();
        creature = new RiverOtter();
        creature.swim();
    }

    public static void test(CanSwim creature) {
        creature.swim();
    }

    interface CanWalk {
        void walk();
    }

    interface CanSwim {
        void swim();
    }

    static abstract class SeaCreature implements CanSwim{
        public void swim() {
            SeaCreature currentCreature = (SeaCreature) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        abstract CanSwim getCurrentCreature();
    }

    static class Orca extends SeaCreature implements CanSwim {
        @Override
        public void swim() {
            super.swim();
        }

        @Override
        CanSwim getCurrentCreature() {
            return new Orca();
        }
    }

    static class Whale extends SeaCreature implements CanSwim{
        @Override
        public void swim() {
            super.swim();
        }

        @Override
        CanSwim getCurrentCreature() {
            return new Whale();
        }
    }

    static class RiverOtter implements CanWalk,CanSwim {
        @Override
        public void walk() {

        }

        @Override
        public void swim() {

        }
    }
}