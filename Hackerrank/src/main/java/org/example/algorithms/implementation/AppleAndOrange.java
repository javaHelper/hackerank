package org.example.algorithms.implementation;

import java.util.List;

public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
        int cntApple = 0, cntOranges = 0;
        for (Integer apple : apples) {
            if(apple + a >= s && apple + a <= t){
                cntApple++;
            }
        }

        for (Integer o: oranges) {
            if (o + b >= s && o + b <= t) {
                cntOranges++;
            }
            System.out.println(cntApple);
            System.out.println(cntOranges);
        }
    }

    public static void main(String[] args) {

    }
}
