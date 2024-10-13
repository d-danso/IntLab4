package org.example.part2;

import java.io.*;

public class MemoryLeakExample {

    public void readFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\DouglasDanso\\Documents\\epdf.pub_the-way-of-kings.epub"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MemoryLeakExample example = new MemoryLeakExample();
        example.readFile();
    }
}
