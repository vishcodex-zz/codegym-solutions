package com.codegym.task.task19.task1902;

/*
Adapter

*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {

    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) {
    }


    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        byte[] byteArr = s.getBytes();
        fileOutputStream.write(byteArr);
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }
}

