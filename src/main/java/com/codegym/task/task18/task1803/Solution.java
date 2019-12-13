package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int data;
        Integer max = 0;
        while (inputStream.available() > 0) {
            data = inputStream.read();
            int counterForData = 0;
            if (map.containsKey(data))counterForData = map.get(data);
            map.put(data, counterForData + 1);
            if (map.get(data) > max) max = map.get(data);
        }
        inputStream.close();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() >= max) {
                System.out.print(entry.getKey() + "\t");
            }
        }

    }
}