package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/*
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {

        System.out.println(labels);
    }

    static {
        labels.put(0.2,"Vishnu");
        labels.put(0.3,"vishh");
        labels.put(0.4,"viss");
        labels.put(0.5,"vi");
        labels.put(0.6,"v");
    }
}
