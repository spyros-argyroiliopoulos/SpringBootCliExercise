package com.codehub.spring.core.utilities;

public class WritePointsToCsvFile {

    private static final String CSV_NEW_LINE_CHARACTER = "\n";
    private static String fileNameAndPath = "D:\\Coding Examples\\Geometry\\exported-points.csv";
    private static String csvSeparator = ",";

    public static void createFile(int size, String fileName) {
        setCsvFileNameAndPath(fileName);
        StringToFileWriter.write(createCsvWithRandomNumbers(size), fileNameAndPath);
    }

    // This method creates a string in CSV format ready to be written in File
    // This METHOD is private, can you tell why?
    private static String createCsvWithRandomNumbers(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(Math.round(Math.random() * 100));
            builder.append(csvSeparator);
            builder.append(Math.round(Math.random() * 100));
            builder.append(CSV_NEW_LINE_CHARACTER);
        }
        return builder.toString();
    }

    // Method that sets File name and Path
    // This is private, can you tell why?
    private static void setCsvFileNameAndPath(String fileName) {
        WritePointsToCsvFile.fileNameAndPath = "D:\\Coding Examples\\Geometry\\" + fileName + ".csv";
    }

    // This CONSTRUCTOR is private, can you tell why?
    private WritePointsToCsvFile() {
    }

    // Can you tell the use of this method?
    public static void setCsvSeparator(String csvSeparator) {
        WritePointsToCsvFile.csvSeparator = csvSeparator;
    }
}