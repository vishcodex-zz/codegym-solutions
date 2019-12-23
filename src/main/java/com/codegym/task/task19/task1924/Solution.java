package com.codegym.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));

        while (reader1.ready()) {
            String word = reader1.readLine();
            String[] words = word.split("\\s+|(?=\\p{Punct})|(?<=\\p{Punct})");

            for (int i = 0; i < words.length; i++) {
                String item = words[i].replaceAll("\\s", "");

                try {
                    int digit = Integer.parseInt(item);

                    if (map.containsKey(digit)) {
                        word = word.replaceFirst(item, map.get(digit));
                    }
                } catch (NumberFormatException e) {

                }
            }
            System.out.println(word);
        }
        reader1.close();
    }
}