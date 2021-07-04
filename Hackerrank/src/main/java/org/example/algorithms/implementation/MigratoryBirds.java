package org.example.algorithms.implementation;

import java.util.*;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer a : arr) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        return map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }

    public static void main(String[] args) {
        System.out.println(MigratoryBirds.migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }
}
