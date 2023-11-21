package com.data.structure.array;

public class SimpleArray {
    private int length;
    private int capacity;
    private Object[] data;

    public SimpleArray() {
        this.length = 0;
        this.capacity = 1;
        this.data = new Object[capacity];
    }

    public void push(Object element) {
        this.data[length] = element;
//        length++;
//        capacity++;
    }

    public void pop() {

    }

    public Object get(int index) {
        return this.data[index];
    }
}
