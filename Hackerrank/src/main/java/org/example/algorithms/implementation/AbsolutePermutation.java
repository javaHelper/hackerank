package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class AbsolutePermutation {
    public static void main(String[] args) {
        System.out.println(absolutePermutation(2,1));
        System.out.println(absolutePermutation(3,0));
        System.out.println(absolutePermutation(3,2));
    }

    public static List<Integer> absolutePermutation(int n, int k) {
        if (k > 0 && n % (2 * k) != 0) {
            return Arrays.asList(-1);
        }
        Integer[] res = new Integer[n];
        int shift = k;
        for (int i = 1; i <= n; ++i) {
            res[i - 1] = i + shift;
            if (k > 0 && i % k == 0) {
                shift *= -1;
            }
        }
        return Arrays.asList(res);
    }
}
