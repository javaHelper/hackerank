package org.example.algorithms.implementation;

public class ChocolateFeast {
    public static void main(String[] args) {
        System.out.println(chocolateFeast(10,2,5));
    }

    static int chocolateFeast(int n, int c, int m) {
        int counter = n / c;
        int wrappers = counter; // 3
        while (wrappers >= m) { // 3 > 2
            int tmp = wrappers / m;
            counter += tmp;
            wrappers = wrappers - (tmp * m) + tmp;
        }

        return counter;
    }
}
