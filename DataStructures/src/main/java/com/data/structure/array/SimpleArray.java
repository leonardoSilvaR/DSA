package com.data.structure.array;

import java.util.Arrays;

public class SimpleArray {
    private static final int INITIAL_LENGTH = 2;
    private int length;
    private Object[] data;


    public SimpleArray() {
        this.length = 0;
        this.data = new Object[INITIAL_LENGTH];
    }

    /**
     * Insert element always at the end of the array,
     * this operation have time complexity of O(n) because resizing.
     *
     * @param element Object to be inserted
     */
    public void push(Object element) {
        if (length >= data.length - 1) {
            data = resize(data);
        }
        this.data[length] = element;
        length++;
    }

    /**
     * Removes the last element,
     * this operation have time complexity of O(1)
     */
    public void pop() {
        if (length > 0) {
            this.data[length - 1] = null;
            length--;
        } else {
            System.out.println("Array is empty");
        }
    }

    /**
     * Accessing elements based on index,
     * this operation have time complexity of O(1)
     *
     * @param index int
     * @return Element at specific index
     */
    public Object get(int index) {
        return this.data[index];
    }

    /**
     * Resizing the original array,
     * this operation have time complexity of O(n) because
     * it is necessary to iterate through entire original array and copy the values
     *
     * @param originalArr Current array
     * @return New array
     */
    private Object[] resize(Object[] originalArr) {
        int newSize = originalArr.length * 2;
        Object[] newArray = new Object[newSize];

        for (int i = 0; i < originalArr.length - 1; i++) {
            newArray[i] = originalArr[i];
        }
        return newArray;
    }

    /**
     * Searching an item based on specific object,
     * this operation takes time complexity of O(n)
     *
     * @param item Search term
     * @return The item or null
     */
    public Object search(Object item) {
        int i = 0;
        while (i <= data.length - 1) {
            if (data[i] == item) {
                return data[i];
            }
            i++;
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
