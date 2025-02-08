package com.capgemini.compare_searching_in_data_structures;

import com.capgemini.compare_data_structure_for_searching.ArraySearch;
import com.capgemini.compare_data_structure_for_searching.HashSetSearch;
import com.capgemini.compare_data_structure_for_searching.TreeSetSearch;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchingInDataStructureTest {
    @Test
    void searchingTestOne(){
        int n = 1_000_000; // Number of elements
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


        long startTime1 = System.nanoTime();
        boolean foundInArray = ArraySearch.linearSearch(array, searchElement);
        long endTime1 = System.nanoTime();

        // Measure search time in HashSet (O(1))
        long startTime2 = System.nanoTime();
        boolean foundInHashSet = HashSetSearch.contains(hashSet, searchElement);
        long endTime2 = System.nanoTime();

        // Measure search time in TreeSet (O(log N))
        long startTime3 = System.nanoTime();
        boolean foundInTreeSet = TreeSetSearch.contains(treeSet, searchElement);
        long endTime3 = System.nanoTime();

        assertTrue(TimeUnit.NANOSECONDS.toMillis((endTime1 - startTime1))>= TimeUnit.NANOSECONDS.toMillis(endTime2 - startTime2)
                && TimeUnit.NANOSECONDS.toMillis(endTime2 - startTime2) >= TimeUnit.NANOSECONDS.toMillis(endTime3 - startTime3) );
    }
}
