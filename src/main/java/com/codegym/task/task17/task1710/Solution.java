package com.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;




public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        if (args[0].equals("-c")) {
            Date d = sdf.parse(args[3]);
            if (args[2].equals("m")) {
                allPeople.add(Person.createMale(args[1], d));
            }
            else {
                allPeople.add(Person.createFemale(args[1], d));
            }
            System.out.println(allPeople.size()-1);
        }

        else if (args[0].equals("-u")) {
            Date d = sdf.parse(args[4]);
            Person updatedPerson = allPeople.get(Integer.parseInt(args[1]));
            updatedPerson.setName(args[2]);
            updatedPerson.setBirthDate(d);
            if (args[3].equals("m")) {
                updatedPerson.setSex(Sex.MALE);
            }
            else {
                updatedPerson.setSex(Sex.FEMALE);
            }
        }

        else if (args[0].equals("-d")) {
            Person deletedPerson = allPeople.get(Integer.parseInt(args[1]));
            deletedPerson.setName(null);
            deletedPerson.setSex(null);
            deletedPerson.setBirthDate(null);
        }

        else if (args[0].equals("-i")) {
            Person displayedPerson = allPeople.get(Integer.parseInt(args[1]));
            String displayedGender;
            SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
            String date_sdfFormat = sdf2.format(displayedPerson.getBirthDate());
            String date_sdf2Format = sdf2.format(sdf2.parse(date_sdfFormat));

            if (displayedPerson.getSex().equals(Sex.MALE)) {
                displayedGender = "m";
            }
            else {
                displayedGender = "f";
            }
            System.out.println(displayedPerson.getName() + " " + displayedGender + " " + date_sdf2Format);

        }
    }
}