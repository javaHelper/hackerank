package org.example.algorithms.implementation;

import java.util.Arrays;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(6, new int[]{0, 1, 2, 4, 3, 5}));
    }

    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < c.length; i++) {
            max = Math.max(max, (c[i] - c[i - 1]) / 2);
        }
        max = Math.max(max, c[0]);
        max = Math.max(max, (n - 1 - c[c.length - 1]));
        return max;
    }
}
