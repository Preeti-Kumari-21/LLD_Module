package com.scaler.exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {
    public static void main(String[] args) {
        String fileName = "D:\\Scaler\\September 2025\\LLD WorkSpace\\LLD_ExceptionHandling\\Test.docx";
        //String filName = "Test.docx";
        File file = new File(fileName);
        try {
            FileReader fileReader = new FileReader(file);
            fileReader.read();
        } catch (java.io.FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
