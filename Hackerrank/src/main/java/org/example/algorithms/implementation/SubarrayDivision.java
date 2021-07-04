package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        // m: Ron's birth month
        // d: Ron's birth day
        int pCake = 0;
        for (int i = 0; i < s.size() - m + 1; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }
            if (sum == d) {
                pCake++;
            }
        }
        return pCake;
    }

    public static void main(String[] args) {
        System.out.println(SubarrayDivision.birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));
    }
}
