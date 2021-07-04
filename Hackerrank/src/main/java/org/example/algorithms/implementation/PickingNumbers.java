package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int index = a.get(i);
            frequency[index]++; //frequency[index]=frequency[index]+1
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(PickingNumbers.pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
    }
}
