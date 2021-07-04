package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class FairRations {
    public static String fairRations(List<Integer> B) {
        int[] b = B.stream().mapToInt(Integer::intValue).toArray();
        int result = getMinLoaveCount(b);
        return result != -1 ? String.valueOf(result) : "NO";
    }

    public static int getMinLoaveCount(int B[]) {
        int minLovesCount = 0, sum = 0;
        for (int i = 0; i < B.length; i++) {
            sum += B[i];
            if (sum % 2 == 1) {
                minLovesCount += 2;
            }
        }
        return ((sum & 1) == 1) ? -1 : minLovesCount;
    }

    public static void main(String[] args) {
        System.out.println(fairRations(Arrays.asList(2, 3, 4, 5, 6)));
    }
}
