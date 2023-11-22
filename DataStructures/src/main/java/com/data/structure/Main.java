package com.data.structure;


import com.data.structure.array.SimpleArray;

public class Main {
    public static void main(String[] args) {
        SimpleArray array = new SimpleArray();
        array.push("Leonardo");
        array.push("Teste");
        array.push("Array Impl");
        array.push("Teste1");
        array.push("Teste1");
        array.push("Teste1");
        array.push("Teste1");
        array.push("Teste1");
        array.push("Teste1");
        array.push("Teste1");
//        array.pop();

        array.search("Teste");

        System.out.println(array);
    }
}