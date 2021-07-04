package org.example.algorithms.implementation;

import java.util.HashMap;

public class MinimumDistances {
    static int minimumDistances(int[] a) {
        HashMap<Integer, Integer> distances = new HashMap<>();
        int minDistance = -1;

        for (int i = 0; i < a.length; i++) {
            if (!distances.containsKey(a[i])) {
                distances.put(a[i], i);
            } else {
                // Calculate distance between like numbers
                int distance = Math.abs(distances.get(a[i]) - i);
                if (distance < minDistance || minDistance == -1) {
                    minDistance = distance;
                }
                // Set start point to the old end point
                distances.put(a[i], i);
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        System.out.println(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));
    }
}
