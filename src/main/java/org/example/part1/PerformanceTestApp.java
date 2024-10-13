package org.example.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PerformanceTestApp {

    // Simulate a method with a sorting algorithm bottleneck
    public void inefficientSort() {
        List<Integer> numbers = generateRandomNumbers(10000);
        // Inefficient bubble sort (O(n^2))
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
    }

    // Simulate excessive object creation
    public void createExcessiveObjects() {
        for (int i = 0; i < 100000; i++) {
            new String("This is a new object");
        }
    }

    // Simulate inefficient database interaction
    public void inefficientDatabaseInteraction() {
        for (int i = 0; i < 1000; i++) {
            // Simulate a database call that could be optimized with batching
            queryDatabase("SELECT * FROM users WHERE id = " + i);
        }
    }

    // Helper method to generate a list of random numbers
    private List<Integer> generateRandomNumbers(int count) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(10000));
        }
        return numbers;
    }

    // Simulated database query method
    private void queryDatabase(String query) {
        // Simulating a database interaction delay
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PerformanceTestApp app = new PerformanceTestApp();
        long startTime = System.currentTimeMillis();

        app.inefficientSort();
        app.createExcessiveObjects();
        app.inefficientDatabaseInteraction();

        long endTime = System.currentTimeMillis();
        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}
