package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(inputStream.available() > 0)
        {
            int read = inputStream.read();
            a.add(read);
        }
        Collections.sort(a);
        Set<Integer> s =new HashSet<Integer>(a);
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        inputStream.close();
    }
}