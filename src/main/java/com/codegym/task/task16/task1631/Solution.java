package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class Solution {
    public static void main(String[] args) {
        try {
            ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
