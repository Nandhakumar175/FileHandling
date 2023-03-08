package com.Ebrain;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {

    public static void main(String[] args) {

        String fileName = "C:\\test\\example.txt";
        String fileContent = "This is an example file created using Java.";

        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(fileContent);
            writer.close();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
