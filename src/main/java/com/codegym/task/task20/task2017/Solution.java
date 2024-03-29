package com.codegym.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/*
Deserialization

*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) throws ClassNotFoundException, IOException {
        try {
            A a = (A) objectStream.readObject();
            return a;
        } catch (Exception e) {
            System.out.println("Exception has been caught");
        }
        return null;
    }


    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
