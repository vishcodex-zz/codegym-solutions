package com.codegym.task.task19.task1906;

/*
Even characters

*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 1");
        String file1=r.readLine();
        String file2=r.readLine();

        FileReader reader = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);
        int i = 0; // to keep a counter of index of characters we are reading from file
        int data; // to get the data into variable
        while(reader.ready()){
            i++; // increment counter after every read operation
            data = reader.read();
            if(i%2==0) {
                writer.write(data);
                //System.out.print((Byte.toString(b[i])));
            }
        }


        r.close();
        reader.close();
        writer.close();
    }
}
