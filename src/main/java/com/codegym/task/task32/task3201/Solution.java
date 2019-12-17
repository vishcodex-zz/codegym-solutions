package com.codegym.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Writing to an existing file

*/
public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        byte[] text = args[2].getBytes();

        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        long size = raf.length();
        if (size < number) {
            raf.seek(size);
            raf.write(text);

        } else {
            raf.seek(number);
            raf.write(text);
        }
        raf.close();
    }
}
