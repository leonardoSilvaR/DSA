package com.algorithms.arrays;

import java.util.Arrays;

public class Merge {


    /**
     * This functions merges two sorted arrays in asc order. Which takes
     * time complexity of O(m+n)
     *
     * @param first  First sorted array
     * @param second Second sorted array
     * @return Merged sorted array
     */
    public int[] sorted(int[] first, int[] second) {
        if (second == null || second.length == 0) {
            return first;
        }

        if (first == null || first.length == 0) {
            return second;
        }

        int index = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        int[] merged = new int[first.length + second.length];

        do {
            if (firstIndex < first.length && (secondIndex >= second.length || first[firstIndex] < second[secondIndex])) {
                merged[index] = first[firstIndex];
                firstIndex++;
            } else {
                merged[index] = second[secondIndex];
                secondIndex++;
            }
            index++;

        } while (index < merged.length);

        return merged;
    }

    public static void main(String[] args) {
        Merge merge = new Merge();

        //Validation cases
        System.out.println(Arrays.toString(merge.sorted(new int[]{1, 2, 3}, null)));
        System.out.println(Arrays.toString(merge.sorted(null, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(merge.sorted(new int[]{1, 3, 5}, new int[]{2, 4, 6, 8})));
        System.out.println(Arrays.toString(merge.sorted(new int[]{2, 4, 6, 8}, new int[]{1, 3, 5})));
        System.out.println(Arrays.toString(merge.sorted(new int[]{2, 4, 6, 8}, new int[]{1, 3, 5, 7})));
    }
}
