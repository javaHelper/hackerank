package org.example.algorithms.implementation;

public class LibraryFine {
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;

        if (y2 < y1) {
            fine = 10000;
        } else if (y2 == y1) {
            if (m2 < m1) {
                fine = (m1 - m2) * 500;
            } else if (m2 == m1) {
                if (d2 < d1) {
                    fine = (d1 - d2) * 15;
                }
            }
        }
        return fine;
    }

    public static void main(String[] args) {
        System.out.println(libraryFine(9,6,2015, 6,6,2015));
    }
}
