package org.example.algorithms.warmups;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().mapToInt(i -> i.intValue()).sum();
    }

    public static void main(String[] args) {
        System.out.println(SimpleArraySum.simpleArraySum(Arrays.asList(2, 3,6,8,10)));
    }
}
