package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        // n = no. of elements in list
        Set<Integer> colors = new HashSet<>();
        int pair = 0;
        for (Integer a: ar) {
            if(!colors.contains(a)){
                colors.add(a);
            }else{
                pair++;
                colors.remove(a);
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        System.out.println(SalesByMatch.sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }
}
