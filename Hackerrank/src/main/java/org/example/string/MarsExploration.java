package org.example.string;

public class MarsExploration {
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
    }

    static int marsExploration(String s) {
        int x = 0;
        int c = 0;
        while (x < s.length()) {
            String t = s.substring(x, x + 3);
            if (t.charAt(0) != 'S') {
                c++;
            }
            if (t.charAt(1) != 'O') {
                c++;
            }
            if (t.charAt(2) != 'S') {
                c++;
            }
            x = x + 3;
        }
        return c;
    }
}
