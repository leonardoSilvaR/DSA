package com.algorithms.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringCharacter {


    /**
     * Optimized version
     * Time complexity O(n)
     * space complexity O(n)
     *
     * @param items array
     * @return first recurring
     */
    public String find(String[] items) {
        Map<String, String> hashTable = new HashMap<>();
        for (int i = 0; i < items.length; i++) {
            if (hashTable.get(items[i]) == null) {
                hashTable.put(items[i], items[i]);
            } else {
                return hashTable.get(items[i]);
            }
        }
        return "-";
    }

    public static void main(String[] args) {
        String[] items = new String[]{"1", "2", "3", "4", "4", "5"};
        String[] items2 = new String[]{"1", "1"};
        String[] items3 = new String[]{"1", "2", "3"};
        FirstRecurringCharacter frc = new FirstRecurringCharacter();

        System.out.println(frc.find(items));
        System.out.println(frc.find(items2));
        System.out.println(frc.find(items3));

    }
}
