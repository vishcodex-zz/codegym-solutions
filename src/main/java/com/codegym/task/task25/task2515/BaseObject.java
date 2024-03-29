package com.codegym.task.task25.task2515;

import static java.lang.Double.max;
import static java.lang.Math.abs;

public abstract class BaseObject {
    private double x;
    private double y;
    private double radius;
    private boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw()
    {

    }

    public void move(){}
    public void die(){
        isAlive=false;
    }

    public boolean intersects(BaseObject o) {
        if(abs(x-y) < max(this.getRadius(),o.getRadius()))
            return true;
        else
            return false;
    }
}
