package com.codegym.task.task31.task3112;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
File downloader

*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://codegym.cc/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);

        String fileName = urlString.substring(urlString.lastIndexOf("/") + 1, urlString.lastIndexOf("."));
        String fileSuffix = urlString.substring(urlString.lastIndexOf("."));

        Path tempFile = Files.createTempFile(fileName, fileSuffix);
        Files.copy(url.openStream(), tempFile);
        return Files.move(tempFile, downloadDirectory.resolve(fileName+fileSuffix));
    }
}
