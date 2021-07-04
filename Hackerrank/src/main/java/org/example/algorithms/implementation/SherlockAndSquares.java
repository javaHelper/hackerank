package org.example.algorithms.implementation;

public class SherlockAndSquares {
    public static void main(String[] args) {
        System.out.println(squares(3,4));
    }

    static int squares(int a, int b) {
        int v1 = (int) Math.sqrt(b);
        int v2 = (int) Math.ceil(Math.sqrt(a));
        return v1 - v2 + 1;
    }
}
