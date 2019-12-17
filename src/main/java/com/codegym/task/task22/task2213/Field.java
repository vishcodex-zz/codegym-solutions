package com.codegym.task.task22.task2213;

public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new int[width][height];

    }

    public void print(){
        
    }

    public void  removeFullLines(){

    }

    public Integer getValue(int a, int b) {
        return a;
    }

    public void setValue(int a, int b, int c)
    {

    }
}
