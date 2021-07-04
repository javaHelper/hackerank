package org.example.algorithms.implementation;

import java.util.HashMap;

public class BeautifulTriplets {

    static int beautifulTriplets(int d, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int counter = 0;
        // i < j < k
        // find = d + a[i]
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                int j = d + arr[i];
                int k = d + j;
                if (map.containsKey(j) && map.containsKey(k)) {
                    counter += map.get(arr[i]) * map.get(j) * map.get(k);
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10}));
    }
}
