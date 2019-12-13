package com.codegym.task.task19.task1903;

/*
Adapting multiple interfaces

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        public String getCompanyName() {
            return data.getCompany();
        }

        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        public String getPhoneNumber() {
            String number = String.format("%010d", data.getPhoneNumber());
            System.out.println(number);
            return "+" + data.getCountryPhoneCode() + number.replaceFirst("(.{3})(.{3})(.{2})(.{2})", "($1)$2-$3-$4");
        }
    }

    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      //  For example: 1

        int getPhoneNumber();           // For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();        // For example: +38(050)123-45-67
    }
}