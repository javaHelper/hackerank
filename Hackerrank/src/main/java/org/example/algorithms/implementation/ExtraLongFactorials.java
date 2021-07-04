package org.example.algorithms.implementation;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        extraLongFactorials(25);
    }

    static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger(String.valueOf(1));
        for (int i = n; i >= 1; i--) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(factorial);
    }
}
