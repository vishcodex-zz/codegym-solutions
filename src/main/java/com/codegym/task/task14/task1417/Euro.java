package com.codegym.task.task14.task1417;

public class Euro extends Money {
    public Euro(double amount) {
        super(amount);
    }


    public double getMoney() {
        return super.getMoney();
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getCurrencyName() {
        return "EUR";
    }
}
