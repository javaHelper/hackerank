package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class ACMICPCTeam {
    public static List<Integer> acmTeam(List<String> topic) {
        String[] tarray = topic.toArray(new String[0]);

        int maxTopics = 0;
        int maxTeams = 0;
        for (int i = 0; i < tarray.length; i++) {
            for (int j = i + 1; j < tarray.length; j++) {
                int tmp = or(tarray[i], tarray[j]);
                if (tmp > maxTopics) {
                    maxTopics = tmp;
                    maxTeams = 1;
                } else if (tmp == maxTopics) {
                    maxTeams++;
                }
            }
        }
        return Arrays.asList(maxTopics, maxTeams);
    }

    static int or(String a, String b) {
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1' || b.charAt(i) == '1') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(acmTeam(Arrays.asList("10101", "11110", "00010")));
    }
}
