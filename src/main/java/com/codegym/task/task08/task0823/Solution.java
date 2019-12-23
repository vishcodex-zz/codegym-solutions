package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        String[] words = s.split("\\s+");
        boolean isWhiteSpace = false;
        ArrayList<String> wordsArray = new ArrayList<>();



        //Convert words[] to wordsArray
        for(int i = 0; i < words.length; i++){
            wordsArray.add(words[i]);
        }

        //If wordsArray index 0 is whitespace then remove it and make boolean isWhiteSpace true
        if(wordsArray.get(0).length() == 0){
            wordsArray.remove(0);
            isWhiteSpace = true;
        }

        //Make all words in wordsArray to uppercase
        for(int i = 0; i < wordsArray.size(); i++){
            String toUpper = wordsArray.get(i);
            String upper = toUpper.substring(0,1).toUpperCase() + toUpper.substring(1);
            wordsArray.set(i, upper);
        }

        //If isWhiteSpace is true make whitespace on the begining of the string and add wordsArray index number 0
        if(isWhiteSpace == true) {
            s = " " + wordsArray.get(0);
        }

        //If isWhiteSpace is false then just add wordsArray index number 0
        else if(isWhiteSpace != true){
            s = wordsArray.get(0);
        }

        //Add all wordsArray to the String
        for(int i = 1; i < wordsArray.size(); i++){
            s = (s + " " + wordsArray.get(i));
        }

        System.out.println(s);
    }
}