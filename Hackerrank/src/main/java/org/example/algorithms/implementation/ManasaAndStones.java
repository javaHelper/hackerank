package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class ManasaAndStones {
    public static List<Integer> stones(int n, int a, int b) {
        if(a == b){
            Integer[] c = { a * (n - 1) };
            return Arrays.asList(c);
        }

        Integer output[] = new Integer[n];
        if (b < a) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        output[0] = a * (n - 1);
        int diff = Math.abs(b - a);
        for (int i = 1; i < n; i++) {
            output[i] = diff + output[i - 1];
        }
        return Arrays.asList(output);
    }

    public static void main(String[] args) {
        System.out.println(stones(2,3,4));
    }
}
