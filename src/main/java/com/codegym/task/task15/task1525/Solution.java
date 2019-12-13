package com.codegym.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            while (reader.ready()) {
                String a = reader.readLine();
                lines.add(a);
            }
            reader.close();
        }catch (Exception ignored){}
    }

    public static void main(String[] args) {
    }
}