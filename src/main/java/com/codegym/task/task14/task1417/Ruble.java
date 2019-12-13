package com.codegym.task.task14.task1417;

public class Ruble extends Money {
    public Ruble(double amount) {
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
        return "RUB";
    }
}
