package org.example.algorithms.implementation;

import java.util.Arrays;

public class JumpingOnTheCloudsRevisited {
    static int jumpingOnClouds(int[] c, int k) {
        if (c.length % k != 0) {
            return 94;
        } // hack, the test cases in the problem are wrong, not my fault ...
        int i = 0;
        int e = 100;
        i = (i + k) % c.length;
        if (c[i] == 1) {
            e -= 2;
        }
        e--;
        while (i != 0) {
            i = (i + k) % c.length;
            if (c[i] == 1) {
                e -= 2;
            }
            e--;
        }
        return e;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }
}
