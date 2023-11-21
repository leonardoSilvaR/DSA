package com.data.structure;


import com.data.structure.array.SimpleArray;

public class Main {
    public static void main(String[] args) {
        SimpleArray array = new SimpleArray();
        array.push("Leonardo");
        array.push("Teste");

        System.out.println(array.get(0));
    }
}