package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int[] ints = ar.stream().mapToInt(Integer::intValue).toArray();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ints[i] + ints[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(DivisibleSumPairs.divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }
}
