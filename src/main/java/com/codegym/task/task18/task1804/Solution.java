package com.codegym.task.task18.task1804;

import java.io.FileInputStream;

/*
Rarest bytes
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
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
        Integer min = Integer.MAX_VALUE;
      //  System.out.println("Old Min value is:"+ min);
        while (inputStream.available() > 0) {
            data = inputStream.read();
            int counterForData = 0;
            if (map.containsKey(data))counterForData = map.get(data);
            map.put(data, counterForData + 1);
            if (map.get(data) < min) min = map.get(data);
        }

  //      System.out.println("New min value is:"+min);
        inputStream.close();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() <= min) {
                System.out.print(entry.getKey() + "\t");
            }
        }

    }
}