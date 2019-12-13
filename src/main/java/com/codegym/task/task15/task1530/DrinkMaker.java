package com.codegym.task.task15.task1530;

public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void addIngredients();
    abstract void pour();

    void makeDrink()
    {
        System.out.println("select a cup");
        System.out.println("add ingredients");
        System.out.println("pour liquid");

    }
}
