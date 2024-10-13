package org.example.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OptimizedPerformanceApp {

    // Optimized sort method using Collections.sort (O(n log n))
    public void efficientSort() {
        List<Integer> numbers = generateRandomNumbers(10000);
        Collections.sort(numbers); // Uses Timsort, O(n log n)
    }

    // Reduced object creation by using a single String object
    public void minimizeObjectCreation() {
        String reusableString = "This is a new object";
        for (int i = 0; i < 100000; i++) {
            // Reuse the same string object
            String processed = reusableString + i;
        }
    }

    // Optimized database interaction with batching
    public void optimizedDatabaseInteraction() {
        StringBuilder batchQuery = new StringBuilder("SELECT * FROM users WHERE id IN (");
        for (int i = 0; i < 1000; i++) {
            batchQuery.append(i);
            if (i < 999) {
                batchQuery.append(", ");
            }
        }
        batchQuery.append(")");
        queryDatabase(batchQuery.toString());
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
        // Simulating a faster database interaction
        try {
            Thread.sleep(1); // Reduced delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OptimizedPerformanceApp app = new OptimizedPerformanceApp();
        long startTime = System.currentTimeMillis();

        app.efficientSort();
        app.minimizeObjectCreation();
        app.optimizedDatabaseInteraction();


        long endTime = System.currentTimeMillis();
        System.out.println("Optimized Execution Time: " + (endTime - startTime) + " ms");
    }
}

