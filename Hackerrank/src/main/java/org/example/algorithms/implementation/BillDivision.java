package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // K - based index to exclude !
        // b - Amount of money Anna contributed
        int[] ints = bill.stream().mapToInt(Integer::intValue).toArray();

        int annaActual = 0;
        int annaCharged = b;
        for (int i = 0; i < ints.length; i++) {
            if(i != k){
                annaActual += ints[i];
            }
        }
        System.out.println("Anna Actual = "+annaActual);
        int value = annaCharged - (annaActual/2);
        System.out.println(value == 0 ? "Bon Appetit" : value);
    }

    public static void main(String[] args) {
        BillDivision.bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
    }
}
