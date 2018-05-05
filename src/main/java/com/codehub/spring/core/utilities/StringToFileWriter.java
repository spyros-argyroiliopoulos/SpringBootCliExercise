package com.codehub.spring.core.utilities;

import java.io.FileWriter;
import java.io.IOException;

public class StringToFileWriter {

    // Method that writes a string at CSV
    public static void write(String stringToBeWritten, String fileNameAndPath) {
        try (FileWriter writer = new FileWriter(fileNameAndPath);) {
            writer.append(stringToBeWritten);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // This Constructor is private, can you tell why?
    private StringToFileWriter() {
    }
}