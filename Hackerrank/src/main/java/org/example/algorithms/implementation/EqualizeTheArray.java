package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {
    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer key : arr) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        int maxUniqueValue = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getValue).get();
        return arr.size() - maxUniqueValue;
    }

    public static void main(String[] args) {
        System.out.println(equalizeArray(Arrays.asList(3, 3, 2, 1, 3)));
    }
}
