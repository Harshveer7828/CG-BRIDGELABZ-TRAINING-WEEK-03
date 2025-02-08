package com.capgemini.compare_data_structure_for_searching;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of iterations:- ");
        int n = sc.nextInt();
        Random rand = new Random();

        // Generate random data
        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add random data in the data structures
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(n * 10);
            array[i] = num;
            hashSet.add(num);
            treeSet.add(num);
        }

        // Pick a random element to search
        int searchElement = array[rand.nextInt(n)];


        long startTime = System.nanoTime();
        boolean foundInArray = ArraySearch.linearSearch(array, searchElement);
        long endTime = System.nanoTime();
        System.out.println("Time taken by Array search: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");

        // Measure search time in HashSet (O(1))
        startTime = System.nanoTime();
        boolean foundInHashSet = HashSetSearch.contains(hashSet, searchElement);
        endTime = System.nanoTime();
        System.out.println("Time taken by HashSet search: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");

        // Measure search time in TreeSet (O(log N))
        startTime = System.nanoTime();
        boolean foundInTreeSet = TreeSetSearch.contains(treeSet, searchElement);
        endTime = System.nanoTime();
        System.out.println("Time taken by TreeSet search: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
    }
}
