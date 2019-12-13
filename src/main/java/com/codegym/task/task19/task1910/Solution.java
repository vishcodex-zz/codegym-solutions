//package com.codegym.task.task19.task1910;
//
///*
//Punctuation
//
//*/
//
//import java.io.*;
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//
//        InputStreamReader is = new InputStreamReader(System.in);
//        BufferedReader reader = new BufferedReader(is);
//
//        String file1 = reader.readLine();
//        String file2 = reader.readLine();
//        reader.close();
//
//        //read file1's contents
//        BufferedReader br = new BufferedReader(new FileReader(file1));
//        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
//
//        String line;
//        while ((line = br.readLine()) != null) {
//            line = line.replaceAll("[^a-zA-Z ]", "");
//            bw.write(line);
//        }
//        bw.close();
//        br.close();
//    }
//}
