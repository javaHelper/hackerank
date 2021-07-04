package org.example.algorithms.warmups;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        List<BigDecimal> values = new ArrayList<>();
        for (Long v : ar){
            values.add(new BigDecimal(v));
        }
        return values.stream().reduce(BigDecimal.ZERO, BigDecimal::add).longValue();
    }

    public static void main(String[] args) {
        System.out.println(AVeryBigSum.aVeryBigSum(Arrays.asList(1000000001L, 1000000002L, 1000000002L, 1000000004L)));
    }
}
