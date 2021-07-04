package org.example.algorithms.implementation;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        System.out.println(ClimbingTheLeaderboard.climbingLeaderboard(
                Arrays.asList(100, 90, 90, 80, 75, 60),
                Arrays.asList(50, 65, 77, 90, 102)));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        int[] scores = ranked.stream().mapToInt(Integer::intValue).toArray();
        int[] alice = player.stream().mapToInt(Integer::intValue).toArray();

        int res[] = new int[alice.length];
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < scores.length; i++) {
            if (!set.contains(scores[i])) {
                list.add(scores[i]);
                set.add(scores[i]);
            }
        }
        for (int i = 0; i < alice.length; i++) {
            int rank = Collections.binarySearch(list, alice[i], Collections.reverseOrder());
            if (rank < 0) {
                rank = Math.abs(rank);
            } else {
                rank = rank + 1;
            }
            res[i] = rank;
        }

        return Arrays.stream(res).boxed().collect(Collectors.toList());
    }
}
