

package com.codegym.task.task18.task1819;

import java.io.*;
import java.util.*;
/*
Combining files
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String file1 = reader.readLine();
            String file2 = reader.readLine();

            FileInputStream inputStream1 = new FileInputStream(file1);
            FileInputStream inputStream2 = new FileInputStream(file2);
            List<Integer> list = new ArrayList<Integer>();

            while (inputStream2.available() > 0) {
                int data = inputStream2.read();
                list.add(data);
            }


            while (inputStream1.available() > 0) {
                int data = inputStream1.read();

                list.add(data);
            }

            FileOutputStream outputStream = new FileOutputStream(file1);
            for (int i = 0; i < list.size(); i++) {
                outputStream.write(list.get(i));
            }

            outputStream.close();
            inputStream1.close();
            inputStream2.close();


        } catch (IOException e) {
        }

    }
}