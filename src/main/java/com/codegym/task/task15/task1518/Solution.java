package com.codegym.task.task15.task1518;

/*
Static modifiers and kittens

*/

public class Solution {
    public static Cat cat;

    static {
       cat = new Cat();
       cat.name="V";
        System.out.println(Solution.cat.name);
    }

    public static void main(String[] args) {

    }
    public static class Cat {
        public String name;
    }

//    public String toString(String name) {   // Second logic
//        return name;
//    }
}