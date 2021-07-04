package org.example.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        System.out.println(BreakingTheRecords.breakingRecords(Arrays.asList(12,24,10,24)));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int[] s = scores.stream().mapToInt(Integer::intValue).toArray();
        int highest, lowest;

        highest = lowest = s[0];
        int[] result = new int[2];
        for (int i = 1; i < s.length; i++) {
            if(s[i] > highest){
                highest = s[i];
                ++result[0];
            }else if(s[i] < lowest){
                lowest = s[i];
                ++result[1];
            }
        }
        List<Integer> r = new ArrayList<>();
        for (int i : result){
            r.add(i);
        }
        return r;
    }
}
