package org.example.algorithms.implementation;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        // p  = page no, n = no of pages!
        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;
        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
    }

    public static void main(String[] args) {
        System.out.println(DrawingBook.pageCount(6, 2));
    }
}
