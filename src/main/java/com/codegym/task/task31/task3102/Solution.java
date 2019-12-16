package com.codegym.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/*
Find all the files

*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {

        List<String> names = new ArrayList<>();
        Queue<File> fileQueue = new LinkedList<>();
        File dir = new File(root);

        fileQueue.add(dir);

        while (!fileQueue.isEmpty()) {

            File[] arrFile = fileQueue.poll().listFiles();
            if (arrFile != null) {
                for (File file : arrFile) {
                    if (file.isDirectory()) {
                        fileQueue.add(file);
                    } else {
                        names.add(file.getAbsolutePath());
                    }

                }
            }
        }
        return names;
    }
}