package com.codegym.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

import static com.codegym.task.task14.task1418.Solution.initList;

/*
Fix four mistakes

*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = initList(new LinkedList<Number>());   // check for the brackets and make sure other methods aren't within main method!
        printListValues(list);
        processCastObjects(list);
    }

    public static List<Number> initList(List<Number> list) {
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));

        return list;
        // 3
    }

    public static void printListValues(List<Number> list) { //  Correct logic within for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // 4 - Correct 2 bugs

    // 5
    public static void processCastObjects(List<Number> list) {   // check for the correct instance
        for (Number object : list) {
            // Correct 2 bugs
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double infinite? " + a.isInfinite());
            }
        }
    }
}
