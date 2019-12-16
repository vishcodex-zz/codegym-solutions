package com.codegym.task.task31.task3109;

import java.io.*;
import java.util.Properties;

/*
Reading config files

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        Properties properties;

        properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.txt");
        properties.list(System.out);

        System.out.println(properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/notExists"));
        try {
            properties.list(System.out);
        } catch (Exception e){

        }
    }

    public Properties getProperties(String fileName) {
        File file = new File(fileName);
        Properties prop = new Properties();

        if (fileName.endsWith(".xml")) {
            try {
                prop.loadFromXML(new FileInputStream(file));
                return prop;
            } catch (Exception e) {
                return null;
            }
        }
        else {
            try {
                prop.load(new FileReader(file));
                return prop;
            } catch (Exception e) {
                return prop;
            }
        }
    }
}
