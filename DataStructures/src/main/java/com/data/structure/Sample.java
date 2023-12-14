package com.data.structure;

import java.util.HashMap;
import java.util.Map;

public class Sample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Leo", 1);
        map.put("Leo", 2);

        System.out.printf(map.toString());

    }
}
