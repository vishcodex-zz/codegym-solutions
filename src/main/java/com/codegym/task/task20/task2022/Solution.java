package com.codegym.task.task20.task2022;

import java.io.*;

/*
Overriding serialization in a thread

*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
//        out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        String filename = (String) in.readObject();
//        String filename = in.readUTF();
        stream = new FileOutputStream(filename, true);
//        in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {

    }
}
