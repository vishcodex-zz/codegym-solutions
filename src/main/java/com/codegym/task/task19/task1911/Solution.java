package com.codegym.task.task19.task1911;

/*
Reader wrapper

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        int charCounter = 0 ;
        String inputValues ;


        PrintStream consoleStream = System.out ;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);

            inputValues = result;
            System.out.println(result.toUpperCase());
//            if(Character.isLowerCase(charCounter)){
//                Character.toUpperCase(charCounter);
//                System.out.println(charCounter);
//            }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}
