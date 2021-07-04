package org.example.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TODO
public class CutTheSticks {
    public static void main(String[] args) {
        System.out.println(cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2, 1}));
    }

    private static int[] cutTheSticks(int[] arr) {
        // Runs in O(n) time
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int lowIdx = 0;
        int minStickLength = arr[0];
        while (i < arr.length) {
            if (arr[i] > minStickLength) {
                list.add(arr.length - (lowIdx));
                lowIdx = i;
                minStickLength += arr[i] - minStickLength;
            }
            i++;
            // Add last
            if (i == arr.length) {
                list.add(arr.length - (lowIdx));
            }
        }
        // Convert to int array
        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++)
            result[j] = list.get(j);
        return result;
    }

}
