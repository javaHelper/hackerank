package org.example.algorithms.implementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class QueensAttackII {
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> o) {
        int[][] obstacles = o.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);

        HashMap<Integer, HashSet<Integer>> cache = new HashMap<>();
        for (int i = 0; i < obstacles.length; i++) {
            if (cache.containsKey(obstacles[i][0])) {
                cache.get(obstacles[i][0]).add(obstacles[i][1]);
            } else {
                cache.put(obstacles[i][0], new HashSet<Integer>());
                cache.get(obstacles[i][0]).add(obstacles[i][1]);
            }
        }
        int counter = 0;
        // right
        for (int i = c_q + 1; i <= n; i++) {
            if (cache.containsKey(r_q) && cache.get(r_q).contains(i)) {
                break;
            }
            counter++;
        }

        // left
        for (int i = c_q - 1; i >= 1; i--) {
            if (cache.containsKey(r_q) && cache.get(r_q).contains(i)) {
                break;
            }
            counter++;
        }

        // down
        for (int i = r_q + 1; i <= n; i++) {
            if (cache.containsKey(i) && cache.get(i).contains(c_q)) {
                break;
            }
            counter++;
        }

        // up
        for (int i = r_q - 1; i >= 1; i--) {
            if (cache.containsKey(i) && cache.get(i).contains(c_q)) {
                break;
            }
            counter++;
        }

        // up-left
        for (int i = r_q - 1, j = c_q - 1; i >= 1 && j >= 1; i--, j--) {
            if (cache.containsKey(i) && cache.get(i).contains(j)) {
                break;
            }
            counter++;
        }

        // up-right
        for (int i = r_q - 1, j = c_q + 1; i >= 1 && j <= n; i--, j++) {
            if (cache.containsKey(i) && cache.get(i).contains(j)) {
                break;
            }
            counter++;
        }

        // down-right
        for (int i = r_q + 1, j = c_q + 1; i <= n && j <= n; i++, j++) {
            if (cache.containsKey(i) && cache.get(i).contains(j)) {
                break;
            }
            counter++;
        }

        // down-left
        for (int i = r_q + 1, j = c_q - 1; i <= n && j >= 1; i++, j--) {
            if (cache.containsKey(i) && cache.get(i).contains(j)) {
                break;
            }
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {

    }
}
