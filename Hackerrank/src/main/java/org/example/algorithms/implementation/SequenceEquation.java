package org.example.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;

// TODO
public class SequenceEquation {
    static int[] permutationEquation(int[] p) {
        int[] res = new int[p.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < p.length; i++) {
            map.put(p[i] - 1, i);
        }
        for (int i = 0; i < p.length; i++) {
            res[i] = map.get(map.get(i)) + 1;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
