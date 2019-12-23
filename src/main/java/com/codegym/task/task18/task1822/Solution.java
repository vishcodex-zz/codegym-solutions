package com.codegym.task.task18.task1822;

/*
Finding data inside a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String[] args) throws IOException {

        int id = Integer.parseInt(args[0]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // int id = Integer.parseInt(reader.readLine())
        FileInputStream is = new FileInputStream(reader.readLine());

        // read the  file content
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(is));

        String line;
        List<String> list = new ArrayList<>();
        while ((line = reader3.readLine()) != null) {
            list.add(line);
        }
        is.close();

        //remove the last element (,) from the list
        list.remove(list.get(list.size() - 1));

        for (String s : list) {
            int productIid = Integer.parseInt(s.substring(0, s.indexOf(" ")));
            // System.out.println(productIid);
            if (productIid == id) {
                System.out.println(s);
            }
        }
    }
}
