package org.example.algorithms.implementation;

public class UtopianTree {
    public static int utopianTree(int n) {
        return (1 << ((n >> 1) + 1)) - 1 << n % 2;
    }

    public static void main(String[] args) {
        System.out.println(UtopianTree.utopianTree(5));
    }
}
