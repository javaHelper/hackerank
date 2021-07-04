package org.example.algorithms.implementation;

import java.util.List;

public class D3SurfaceArea {
    public static void main(String[] args) {
      //  System.out.println(widthView());
    }

    static int widthView(int[][] A) {
        int H = A.length;
        int W = A[0].length;

        int area = 0;
        for (int row = 0; row < H; row++) {

            // **** area of first column ****
            area += A[row][0];

            // **** compute area(s) for each column ****
            for (int col = 1; col < W; col++) {
                area += Math.abs(A[row][col] - A[row][col - 1]);
            }

            // **** area of last column ****
            area += A[row][W - 1];
        }
        return area;
    }

    /*
     * Compute the area for height (vertical) view.
     */
    static int heightView(int[][] A) {
        int H = A.length;
        int W = A[0].length;

        // **** loop once per column ****
        int area = 0;
        for (int col = 0; col < W; col++) {

            // **** area of first row ****
            area += A[0][col];

            // **** compute areas(s) for each row ****
            for (int row = 1; row < H; row++) {
                area += Math.abs(A[row][col] - A[row - 1][col]);
            }

            // **** area of last row ****
            area += A[H - 1][col];
        }
        return area;
    }

    /*
     * Compute area for vertical view.
     */
    static int verticalView(int[][] A) {
        int H = A.length;
        int W = A[0].length;
        int area = 0;
        for (int row = 0; row < H; row++) {
            for (int col = 0; col < W; col++) {
                if (A[row][col] != 0)
                    area++;
            }
        }
        area *= 2;
        return area;
    }

    /*
     * Complete the surfaceArea function below.
     */
    static int surfaceArea(List<List<Integer>> V) {
        int[][] A = V.stream().map(a -> a.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
        // **** ****
        int area = 0;

        // **** compute width view area ****
        area += widthView(A);

        // **** compute height view area ****
        area += heightView(A);

        // **** compute vertical view area ****
        area += verticalView(A);

        // **** ****
        return area;
    }
}
