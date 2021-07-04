package org.example.algorithms.implementation;

import java.math.BigInteger;

public interface TaumAndBday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        BigInteger c = BigInteger.valueOf(b);
        BigInteger d = BigInteger.valueOf(Math.min(bc, wc + z));
        BigInteger e = BigInteger.valueOf(w);
        BigInteger f = BigInteger.valueOf(Math.min(wc, bc + z));

        return c.multiply(d).add(e.multiply(f)).longValue();
    }

    public static void main(String[] args) {
        System.out.println(taumBday(3,5,3,4,1));
    }
}
