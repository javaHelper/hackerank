package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(3, Arrays.asList(1, 7, 2, 4)));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] array = s.stream().mapToInt(Integer::intValue).toArray();

        int[] mods = new int[k];
        for (int i = 0; i < array.length; i++) {
            mods[array[i] % k]++;
        }
        int max = Math.min(mods[0], 1);
        for (int i = 1, j = mods.length - 1; i <= j; i++, j--) {
            if (i == j) {
                max += Math.min(mods[i], 1);
            } else {
                max += Math.max(mods[i], mods[j]);
            }
        }
        return max;
    }
}
