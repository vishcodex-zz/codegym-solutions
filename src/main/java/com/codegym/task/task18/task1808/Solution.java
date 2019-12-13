package com.codegym.task.task18.task1808;

/*
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1, fileName2, fileName3;
        FileInputStream inputStream = null;
        FileOutputStream outputStream2 = null;
        FileOutputStream outputStream3 = null;

        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            fileName3 = reader.readLine();
            inputStream = new FileInputStream(fileName1);
            outputStream2 = new FileOutputStream(fileName2);
            outputStream3 = new FileOutputStream(fileName3);
            byte[] buffer = new byte[inputStream.available()];

            while(inputStream.available() > 0){
                // read the next block of bytes into buffer
                int count = inputStream.read(buffer);
                int halfCount = 0;
                if (count % 2 == 0){
                    halfCount = count/2;
                }
                else{
                    halfCount = count/2 + 1;
                }
                // depends on count is odd or even
                outputStream2.write(buffer, 0, halfCount);
                outputStream3.write(buffer, halfCount, count-halfCount);
            }

            reader.close();
            inputStream.close();
            outputStream2.close();
            outputStream3.close();

        }
        catch (IOException e){
            reader.close();
            inputStream.close();
            outputStream2.close();
            outputStream3.close();
        }
    }
}
