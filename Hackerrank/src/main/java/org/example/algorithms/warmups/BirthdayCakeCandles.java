package org.example.algorithms.warmups;

import java.util.*;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer value : candles) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }
        return map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getValue();
    }

    public static void main(String[] args) {
        System.out.println(BirthdayCakeCandles.birthdayCakeCandles(Arrays.asList(3, 2, 1, 3)));
    }
}
