package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {
        System.out.println(TheHurdleRace.hurdleRace(4, Arrays.asList(1, 6, 3, 5, 2)));
    }

    public static int hurdleRace(int k, List<Integer> height) {
        Integer maxHt = height.get(0);
        for (Integer h : height) {
            maxHt = h > maxHt ? h : maxHt;
        }
        return (maxHt - k > 0) ? maxHt - k : 0;
    }
}
