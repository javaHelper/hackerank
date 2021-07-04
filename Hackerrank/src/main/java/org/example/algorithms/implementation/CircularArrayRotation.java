package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> aa, int k, List<Integer> q) {
        int[] a = aa.stream().mapToInt(Integer::intValue).toArray();
        int[] queries = q.stream().mapToInt(Integer::intValue).toArray();

        k = k % a.length;
        Integer[] result = new Integer[queries.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[(queries[i] - k + a.length) % a.length];
        }

        return Arrays.asList(result);
    }

    public static void main(String[] args) {
        System.out.println(circularArrayRotation(Arrays.asList(3, 4, 5), 2, Arrays.asList(1, 2)));
    }
}
