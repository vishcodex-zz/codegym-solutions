package com.codegym.task.task18.task1818;

/*
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = br.readLine();
            String file2 = br.readLine();
            String file3 = br.readLine();
            br.close();

            FileOutputStream outputStream = new FileOutputStream(file1);

            FileInputStream inputStream1 = new FileInputStream(file2);

            FileInputStream inputStream2 = new FileInputStream(file3);

            byte[] buffer = new byte[inputStream1.available()];

            int i = inputStream1.read(buffer);
            outputStream.write(buffer);
            inputStream1.close();

            byte[] buffer1 = new byte[inputStream2.available()];
            i = inputStream2.read(buffer1);
            outputStream.write(buffer1);
            inputStream2.close();

            outputStream.close();
        } catch (IOException e) {
        }


    }
}
