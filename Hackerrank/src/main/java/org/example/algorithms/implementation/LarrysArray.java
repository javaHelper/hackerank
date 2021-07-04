package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class LarrysArray {
    public static String larrysArray(List<Integer> A) {
        int numberOfInversions = 0;
        for (int k = 0; k < A.size(); k++) {
            for (int k2 = k + 1; k2 < A.size(); k2++) {
                if (A.get(k) > A.get(k2)) {
                    numberOfInversions++;
                }
            }
        }

        if (numberOfInversions % 2 == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        System.out.println(larrysArray(Arrays.asList(3, 1, 2)));
    }
}
