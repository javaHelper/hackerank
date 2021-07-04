package org.example.algorithms.warmups;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        MiniMaxSum.miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
    }

    public static void miniMaxSum(List<Integer> values) {
        int[] arr = values.stream().mapToInt(Integer::intValue).toArray();
        long min = 0, max = 0, sum = 0;
        min = arr[0];
        max = min;
        sum = min;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print((sum - max) + " " + (sum - min));
    }
}
