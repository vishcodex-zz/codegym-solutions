package com.codegym.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "";
        while (!(fileName = reader.readLine()).equals("exit")) {
            ReadThread rd = new ReadThread(fileName);
            rd.start();
            resultMap.put(fileName,rd.frequentFinder());
        }

//        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }

    public static class ReadThread extends Thread {
        private FileInputStream fis;

        public ReadThread(String fileName) throws IOException {
            // Implement constructor body
            this.fis = new FileInputStream(fileName);
        }

        // Implement file reading here
        public int frequentFinder() throws IOException {
            Map<Integer, Integer> map = new HashMap<>();
            while (fis.available() > 0) {
                int data = fis.read();

                if (map.containsKey(data)) {
                    map.put(data, map.get(data) + 1);
                } else {
                    map.put(data, 1);
                }
            }
            int frequentByte = 0;
            int frecuency = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > frecuency){
                    frequentByte = entry.getKey();
                    frecuency = entry.getValue();
                }
            }
            fis.close();
            return frequentByte;
        }

    }
}
