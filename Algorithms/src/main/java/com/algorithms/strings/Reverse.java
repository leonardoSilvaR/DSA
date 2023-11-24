package com.algorithms.strings;

public class Reverse {

    /**
     * This algorithm takes O(n) time and space complexity
     * @param array Current char array to be reversed
     * @return Reversed array
     */
    public static char[] reverse(char[] array) {
        int length = array.length;

        char[] reversedArray = new char[length];

        int j = 0;
        for (int i = length - 1; i >= 0; i--) {
            reversedArray[j] = array[i];
            j++;
        }

        return reversedArray;
    }


}
