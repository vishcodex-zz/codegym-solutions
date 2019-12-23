package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // write your code here
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String s : array){
            if (isNumber(s)){
                numbers.add(Integer.parseInt(s));
            }else{
                words.add(s);
            }
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);
        // first solution - easier for sorting words
        //Collections.sort(words);

        for (int i = 0; i < words.size();i++){
            for (int j = i + 1; j < words.size()-1; j++){

                if (isGreaterThan(words.get(i), words.get(j))) {
                    String temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }
        }

        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length;i++){
            if (isNumber(array[i])){
                array[i] = String.valueOf(numbers.get(x));
                x++;
            } else {
                array[i] = words.get(y);
                y++;
            }
        }
    }


    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
