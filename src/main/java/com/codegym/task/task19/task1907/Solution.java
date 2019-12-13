package com.codegym.task.task19.task1907;

import java.io.*;
import java.util.*;

/*
Counting words

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader input = new FileReader(fileName);
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter("\\W");
        int worldCount = 0;
        while (scanner.hasNext()){
            String data = scanner.next();
            if (data.equals("world")) {
                worldCount++;
            }
        }
        scanner.close();
        input.close();
        System.out.println(worldCount);
    }
}
