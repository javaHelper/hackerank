package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        // k - Threashold
        int onTime = 0;
        for (Integer i : a) {
            if (i <= 0) {
                onTime++;
            }
        }
        return onTime >= k ? "NO" : "YES";
    }

    public static void main(String[] args) {
        System.out.println(AngryProfessor.angryProfessor(3, Arrays.asList(-2, -1, 0, 1, 2)));
    }
}
