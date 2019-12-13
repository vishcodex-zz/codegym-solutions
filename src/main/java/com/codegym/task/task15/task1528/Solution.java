package com.codegym.task.task15.task1528;

/*
OOP: The Euro is money too

*/

public class Solution {
    public static void main(String[] args) throws StackOverflowError{
        try {
            System.out.println(new Euro().getAmount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static abstract class Money {
        abstract Money getMoney();

        abstract Object getAmount();
    }

    // Add your code below
    public static class Euro extends Money {
        private double amount = 123d;

        @Override
        public Object getAmount() {
            return new Double(amount);
        }

        public Euro getMoney() {
            return this;
        }
    }
}