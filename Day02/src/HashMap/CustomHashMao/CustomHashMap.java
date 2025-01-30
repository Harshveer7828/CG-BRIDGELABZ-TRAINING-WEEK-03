package HashMap.CustomHashMao;

import java.util.LinkedList;

public class CustomHashMap {


    private static final int SIZE = 10;
    private LinkedList<Entry>[] table;

    // Entry class to store key-value pairs
    static class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the hash table
    public CustomHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to calculate index
    private int getHash(int key) {
        return key % SIZE;
    }

    // Insert a key-value pair
    public void put(int key, int value) {
        int index = getHash(key);
        LinkedList<Entry> bucket = table[index];

        // Check if key already exists, update value
        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        // If key is not found, add a new entry
        bucket.add(new Entry(key, value));
    }

    // Retrieve value by key
    public Integer get(int key) {
        int index = getHash(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null; // Key not found
    }

    // Remove a key-value pair
    public void remove(int key) {
        int index = getHash(key);
        LinkedList<Entry> bucket = table[index];

        // Find and remove the entry
        bucket.removeIf(entry -> entry.key == key);
    }

    // Display the hash map
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Entry entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }

    // Main function to test the CustomHashMap
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(12, 120); // This will go in the same bucket as key 2 (collision)
        map.put(5, 50);
        map.put(15, 150); // Another collision with key 5

        map.display();

        System.out.println("\nValue for key 2: " + map.get(2));
        System.out.println("Value for key 5: " + map.get(5));

        map.remove(2);
        System.out.println("\nAfter removing key 2:");
        map.display();
    }
}

