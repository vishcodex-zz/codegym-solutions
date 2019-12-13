package com.codegym.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;/*
Extending AmigoOutputStream

*/
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream amigo;
    public QuestionFileOutputStream(AmigoOutputStream amigo)
    {
        this.amigo = amigo;
    }

    @Override
    public void flush() throws IOException {
        amigo.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigo.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigo.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigo.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Do you really want to close the stream? Y/N");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.readLine().equals("Y")) amigo.close();
        br.close();
    }
}