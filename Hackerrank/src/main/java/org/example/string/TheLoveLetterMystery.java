package org.example.string;

public class TheLoveLetterMystery {
    public static int theLoveLetterMystery(String s) {
        int counter = 0;
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                counter += Math.abs(((int) s.charAt(i)) - ((int) s.charAt(j)));
            }
            i++; j--;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abc"));
        System.out.println(theLoveLetterMystery("abcba"));
        System.out.println(theLoveLetterMystery("abcd"));
        System.out.println(theLoveLetterMystery("cba"));
    }
}
