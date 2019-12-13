package com.codegym.task.task19.task1909;

/*
Changing punctuation marks

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        br.close();

        BufferedReader reader = new BufferedReader(new FileReader(a));

        BufferedWriter writer = new BufferedWriter(new FileWriter(b));

        while(reader.ready()) {
            String str = reader.readLine();
            String newStr = str.replace(".","!");
            writer.write(newStr);
        }

        reader.close();
        writer.close();
    }
}
