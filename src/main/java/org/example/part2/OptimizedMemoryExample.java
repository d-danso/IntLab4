package org.example.part2;

import java.io.*;

public class OptimizedMemoryExample {

    public void readFile() {
        // Use try-with-resources to ensure the reader is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DouglasDanso\\Documents\\epdf.pub_the-way-of-kings.epub"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OptimizedMemoryExample example = new OptimizedMemoryExample();
        example.readFile();
    }
}
