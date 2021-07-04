package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class LisasWorkbook {
    public static void main(String[] args) {
        System.out.println(workbook(5,3, Arrays.asList(4, 2, 6, 1, 10)));
    }

    public static int workbook(int n, int k, List<Integer> a) {
        int[] arr = a.stream().mapToInt(Integer::intValue).toArray();
        int s = 1;
        int c = 0;
        for (int x = 0; x < n; x++) {
            int co = 0;
            for (int y = 1; y <= arr[x]; y++) {
                co++;
                if (co == k + 1) {
                    s++;
                    co = 1;
                }
                if (y == s) {
                    c++;
                }
            }
            s++;
        }
        return c;
    }
}
