package org.example.algorithms.implementation;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        kaprekarNumbers(1,100);
    }

    static void kaprekarNumbers(int p, int q) {
        boolean found = false;
        for (int i = p; i <= q; i++) {
            if (isKaprekar(i)) {
                System.out.print("" + i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("INVALID RANGE");
        }
    }
    static boolean isKaprekar(long n) {
        long square = n * n;
        String l = "" + n;
        String tmp = "" + square;
        int diff = tmp.length() - l.length();
        long right = Long.parseLong(tmp.substring(diff));
        if (tmp.length() == l.length()) {
            return n == right;
        }
        long left = Long.parseLong(tmp.substring(0, diff));
        return (right + left) == n;
    }
}
