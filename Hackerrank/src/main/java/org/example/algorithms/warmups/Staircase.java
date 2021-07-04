package org.example.algorithms.warmups;

public class Staircase {
    public static void staircase(int n) {
        String str = "#";
        for (int i = 0; i < n; i++) {
            System.out.printf("%" + n + "s \n", str);
            str += "#";
        }
    }

    public static void main(String[] args) {
        Staircase.staircase(6);
    }
}
