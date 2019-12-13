package com.codegym.task.task18.task1809;

/*
Reversing a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        String fileName2 = r.readLine();
        FileInputStream in = new FileInputStream(fileName);
        FileOutputStream out = new FileOutputStream(fileName2);
        byte[] buffer = new byte[in.available()];
        int count = in.available();
        int s = in.read(buffer);
        for (int i = count-1; i >= 0 ; i--) {
            out.write(buffer[i]);
        }
        in.close();
        out.close();
    }
}
