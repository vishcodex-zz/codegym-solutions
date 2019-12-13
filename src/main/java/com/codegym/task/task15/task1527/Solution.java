package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/*
Request parser

*/

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] trash = input.split("\\?");
        String[] split1 = trash[1].split("&");
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> listObject = new ArrayList<String>();

        for (int i = 0; i < split1.length; i++){
            if(split1[i].contains("=")){
                String[] split2 = split1[i].split("=");
                if (split2[0].equals("obj")){
                    list.add(split2[0]);
                    listObject.add(split2[1]);
                } else {
                    list.add(split2[0]);
                }
            } else {
                list.add(split1[i]);
            }
        }

        for (int i = 0; i < list.size(); i++){
            if (i != list.size()-1){
                System.out.print(list.get(i) + " ");
            } else {
                System.out.print(list.get(i) + "\n");
            }
        }


        for (String s : listObject){
                try {
                    double i = Double.parseDouble(s);
                    alert(i);
                    break;
                } catch (Exception e){
                    alert(s);
                }
            }
        }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}