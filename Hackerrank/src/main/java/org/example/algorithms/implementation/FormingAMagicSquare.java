package org.example.algorithms.implementation;

public class FormingAMagicSquare {
    public static void main(String[] args) {

    }

    static int formingMagicSquare(int[][] s) {
        int[][][] magicSquareCombinations = { { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
                { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } }, { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
                { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } }, { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
                { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } }, { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
                { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } } };

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < magicSquareCombinations.length; i++) {
            int modifyCost = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    modifyCost += Math.abs(s[j][k] - magicSquareCombinations[i][j][k]);
                }
            }
            minCost = Math.min(modifyCost, minCost);
        }
        return minCost;
    }
}
