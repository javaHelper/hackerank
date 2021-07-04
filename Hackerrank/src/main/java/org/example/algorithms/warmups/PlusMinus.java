package org.example.algorithms.warmups;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        float zerocnt = 0.0f;
        float postivecnt = 0.0f;
        float negativecnt = 0.0f;

        for (Integer v: arr) {
            if(v == 0){
                zerocnt++;
            }else if(v > 0){
                postivecnt++;
            }else if (v < 0) {
                negativecnt++;
            }
        }
        System.out.printf("%1.6f \n", postivecnt / arr.size());
        System.out.printf("%1.6f \n", negativecnt / arr.size());
        System.out.printf("%1.6f \n", zerocnt / arr.size());
    }
    public static void main(String[] args) {
        PlusMinus.plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }
}
