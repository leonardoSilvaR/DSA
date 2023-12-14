package com.data.structure.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTable {

    private int MAX_SIZE = 10;
    private final DataBucket[] bucket;

    public HashTable() {
        this.bucket = new DataBucket[MAX_SIZE];
    }

    public HashTable(int maxSize) {
        this.MAX_SIZE = maxSize;
        this.bucket = new DataBucket[MAX_SIZE];
    }

    /**
     * Insert some data to Hash Table buckets.
     * When collision happens the time complexity will be O(n),
     * Otherwise O(1)
     *
     * @param key   Reference value
     * @param value data
     */
    //TODO: Collision handling has to be implemented
    public void put(String key, String value) {
        if (bucket[hash(key)] == null) {
            bucket[hash(key)] = new DataBucket(key, value);
        } else {
            System.out.println("Collision");
        }
    }

    /**
     * Retrieve stored data,
     * When collision happens the time complexity will be O(n),
     * Otherwise O(1)
     *
     * @param key Search term
     * @return Data Value
     */
    //TODO: Collision lookUp has to be implemented
    public String get(String key) {
        DataBucket stored = bucket[hash(key)];
        if (stored != null) {
            return stored.getValue();
        }
        return null;
    }

    /**
     * Deletes a specific data based on the key.
     * When collision happens the time complexity will be O(n),
     * Otherwise O(1)
     *
     * @param key Reference value
     */
    //TODO: Collision handling has to be implemented
    public void remove(String key) {
        bucket[hash(key)] = null;
    }

    /**
     * Retrieves all stored keys.
     * When collision happens the time complexity will be O(n²),
     * Otherwise O(n)
     *
     * @return A list of valid Keys
     */
    //TODO: Collision handling has to be implemented
    public List<String> keys() {
        List<String> keys = new ArrayList<>();

        for (DataBucket dataBucket : bucket) {
            if (dataBucket != null && dataBucket.getKey() != null) {
                keys.add(dataBucket.getKey());
            }
        }

        return keys;
    }

    /**
     * This is considered O(1) because it handles a fixed/small
     * input size 'Key' in terms of growth;
     *
     * @param key Value to be computed
     * @return hash
     */
    private int hash(String key) {
        int hash = 0;
        if (key != null) {
            for (int i = 0; i < key.length(); i++) {
                hash = (hash + key.charAt(i) * i) % MAX_SIZE;
            }
        }
        return hash;
    }

    @Override
    public String toString() {
        return "HashTable{" + Arrays.toString(bucket) + '}';
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put("Test", "Television");
        hashTable.put("Te", "Television");
//        hashTable.put("Computer", "Computer");
//        System.out.println(hashTable.get("Test"));
//        System.out.println(hashTable.get("Test1"));
//        System.out.println(hashTable);


//        hashTable.remove("Computer");

        System.out.println(hashTable);
        System.out.println(hashTable.keys());

    }
}
