package com.codegym.task.task16.task1631;
import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader i;

    public static ImageReader getImageReader(ImageTypes type){
        if(type == null){
            throw new IllegalArgumentException("Unknown image type");
        }
        switch(type) {
            case JPG :
                return new JpgReader();
            case PNG :
                return new PngReader();
            case BMP :
                return new BmpReader();
            default :
                throw new IllegalArgumentException("Unknown image type");
        }
    }
}