package com.algorithms.strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    /**
     * Brute force approach
     *
     * @param strs Array of words
     * @return possible common letters
     */
    public static String longestCommonPrefix(String[] strs) {
        String result = "";

        int arrayLength = strs.length;
        int smallWord = Integer.MAX_VALUE;

        //Determines the smallest word
        for (String word : strs) { //O(n)
            int wordLength = word.length();
            smallWord = Math.min(wordLength, smallWord);
        }

        for (int i = 0; i < smallWord; i++) { //O(n)
            char currentLetter = strs[0].charAt(i);

            boolean hasLetter = true;

            for (int j = 1; j < arrayLength; j++) { //O(n-1)
                char currentCompare = strs[j].charAt(i);
                if (currentLetter != currentCompare) {
                    hasLetter = false;
                    break;
                }
            }

            if (hasLetter) {
                result += currentLetter;
            } else {
                break;
            }
        }


        return result;
    }

    public static String optimal(String[] strs) {
        String result = "";

        Arrays.sort(strs);

        int lengthSmallWord = strs[0].toCharArray().length;

        for (int i = 0; i < lengthSmallWord; i++) {
            char firstLetterFirstItem = strs[0].charAt(i);
            char firstLetterLastItem = strs[strs.length - 1].charAt(i);

            if (firstLetterFirstItem != firstLetterLastItem) {
                break;
            }

            result += firstLetterFirstItem;
        }

        return result;
    }



    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strs));
        System.out.println(LongestCommonPrefix.optimal(strs));
    }
}
