package com.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/*
Reinforce the adapter

*/

public class Solution {
    public static Map<String,String> countries = new HashMap<>();

    static {
        countries.put("UA","Ukraine");
        countries.put("US","United States");
        countries.put("FR","France");
    }

    public static void main(String[] args) {
        String s = "Peterson, John";
        System.out.println(s.substring(s.indexOf(" ") + 1));
//        System.out.println(s.substring(0, s.indexOf(",")));
//        StringBuilder s = new StringBuilder();
//        String phone = "+1(111)222-3333";
//        s.append("callto://+");
//        for (int i = 0; i <phone.length() ; i++) {
//            if ( "1234567890".indexOf(phone.substring(i, i+1)) > -1) {
//                s.append(phone.substring(i, i+1));
//            }
//        }
//        System.out.println(s.toString());
    }

    public static class DataAdapter implements RowItem {

        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {

            this.customer = customer;
            this.contact = contact;

        }
        @Override
        public String getCountryCode() {
            for(Map.Entry<String,String> m : countries.entrySet() )
            {
                if (m.getValue().equals(this.customer.getCountryName())){
                    return m.getKey();
                }
            } return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String firstName = contact.getName();
            return firstName.substring(firstName.lastIndexOf(" ")+ 1);
        }

        @Override
        public String getContactLastName() {
            String lastName = contact.getName();
            return lastName.substring(0, lastName.indexOf(","));
        }

        @Override
        public String getDialString() {
            return "callto://+" + contact.getPhoneNumber().replaceAll("[^0-9]", "");
        }

        @Override
        public String getCompanyName() {
            return null;
        }

        @Override
        public String getCountryName() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public String getPhoneNumber() {
            return null;
        }
    }

    public static interface RowItem extends Customer, Contact {
        String getCountryCode();        // For example: US
        String getCompany();            // For example: CodeGym Ltd.
        String getContactFirstName();   // For example: John
        String getContactLastName();    // For example: Peterson
        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.
        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John
        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}