package org.example.algorithms.warmups;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int[][] flat = arr.stream().map(a -> a.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);

        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < flat.length; i++) {
            leftSum += flat[i][i];
            rightSum += flat[i][flat.length - 1 - i];
        }
        return Math.abs(leftSum - rightSum);
    }

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
    }
}
