package com.codegym.task.task19.task1904;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String pInfo =fileScanner.nextLine();
            String lastName = pInfo.substring(0, pInfo.indexOf(' '));

            pInfo = pInfo.substring(lastName.length()+1);
            String firstName = pInfo.substring(0, pInfo.indexOf(' '));

            pInfo = pInfo.substring(firstName.length()+1);
            String middleName = pInfo.substring(0, pInfo.indexOf(' '));

            String birthDay = pInfo.substring(middleName.length()+1);
            Date date = new Date();

            try { date = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(birthDay); }
            catch (ParseException e) { System.out.println("ParseException was caught: " + e.getMessage()); }

            return new Person(middleName, lastName, firstName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

    }
}
