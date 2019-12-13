package com.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> linesForRemoval = new ArrayList<String>();

    public static void main(String[] args) {
        String allLineFileName;
        String linesForRemovalFileName;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            allLineFileName = br.readLine();
            linesForRemovalFileName = br.readLine();
            br.close();
            readFile(allLines, allLineFileName);
            readFile(linesForRemoval, linesForRemovalFileName);
            Solution data = new Solution();
            data.joinData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);
        }
        else if (allLines.size() == 0) {
            allLines.clear();
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

        public static void readFile (List < String > t, String s){
            try {
                BufferedReader b = new BufferedReader(new FileReader(s));
                String s1;
                while ((s1 = b.readLine()) != null) {
                    t.add(s);
                }
                b.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
