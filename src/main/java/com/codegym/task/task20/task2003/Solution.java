package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.*;

/*
Introducing properties

*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        // Implement this method
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(consoleReader.readLine());

        load(inputStream);

        inputStream.close();
        consoleReader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        // Implement this method

        Properties properties = new Properties();

        for (Map.Entry<String, String> entry : Solution.properties.entrySet()) {
            properties.put(entry.getKey(), entry.getValue());
        }

        properties.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        // Implement this method

        Properties properties = new Properties();
        properties.load(inputStream);

        Set keys = properties.keySet();
        Iterator iterator = keys.iterator();

        String key;
        String value;

        while (iterator.hasNext()) {
            key = (String) iterator.next();
            value = properties.getProperty(key);
            Solution.properties.put(key, value);
        }
    }

    public static void main(String[] args) throws Exception {

        Solution s = new Solution();
        s.fillInPropertiesMap();

        OutputStream outputStream = new FileOutputStream("/home/jesus/Desktop/2.txt");

        s.save(outputStream);
        outputStream.close();
    }
}
