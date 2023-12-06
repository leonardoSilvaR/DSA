package com.algorithms.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Samples {

    //88 -> 3
    //99 -> 2
    //32 -> 1
    //12 -> 1 Same sender and recipient
    //---------------------------------
    // threshold = 2
    // Output = ["88", "99"]
    public List<String> verifyLog(List<String> logs, int threshold) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> userMap = new HashMap<>();

        for (String log : logs) {
            String[] splitInfo = log.split(" ");
            String[] users = new String[]{splitInfo[0], splitInfo[1]};

            if (users[0].equals(users[1])) {
                Integer count = 1;
                if (userMap.get(users[0]) != null) {
                    count = userMap.get(users[0]) + 1;
                }
                userMap.put(users[0], count);
            } else {
                for (String user : users) {
                    if (userMap.get(user) != null) {
                        Integer count = userMap.get(user) + 1;
                        userMap.put(user, count);
                    } else {
                        userMap.put(user, 1);
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> mapEntry : userMap.entrySet()) {
            if (mapEntry.getValue() >= threshold) {
                result.add(mapEntry.getKey());
            }
        }

        return result;
    }


    public static void main(String[] args) {
        List<String> logs = new ArrayList<>();
        logs.add("88 99 200");
        logs.add("88 99 350");
        logs.add("88 32 400");
        logs.add("12 12 50");

        Samples samples = new Samples();
        System.out.println(samples.verifyLog(logs, 2));
    }
}
