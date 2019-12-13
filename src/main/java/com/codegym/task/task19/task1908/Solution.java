package com.codegym.task.task19.task1908;

/*
Picking out numbers

*/
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = br.readLine();
        String outputFile = br.readLine();
        br.close();

        FileReader reader = new FileReader(inputFile);
        FileWriter writer = new FileWriter(outputFile);

        br = new BufferedReader(reader);

        BufferedWriter bw = new BufferedWriter(writer);

        ArrayList<Integer> fileNumbers = new ArrayList<>();

        String line = br.readLine();

        while( line != null){
            String[] lineArr = line.split(" ");

            for(int i = 0; i < lineArr.length; i++){
                try{
                    int n = Integer.parseInt(lineArr[i].trim());

                    fileNumbers.add(n);
                }catch(Exception e){

                }
            }
            //bw.write(resultedLine);
            line = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        for(int num : fileNumbers){
            sb.append(num).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());
        bw.close();
        br.close();
        reader.close();
        writer.close();
    }
}
