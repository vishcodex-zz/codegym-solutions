package com.codegym.task.task17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sol {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream f = new FileInputStream("C:\\Users\\AF82152\\Downloads\\github-recovery-codes.txt");
   //     C:\Users\AF82152\Downloads\github-recovery-codes.txt
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\AF82152\\Downloads\\github-recovery-codes_v1.txt");
    long sum = 0;
        try {
            while(f.available() > 0 )
            {
                int data = f.read();
                outputStream.write(data);;
            }
            f.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}

