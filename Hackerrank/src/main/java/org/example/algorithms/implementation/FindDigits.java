package org.example.algorithms.implementation;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }

    static int findDigits(int n) {
        String number = "" + n;
        int cnt = 0;
        char[] ca = number.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            int value = Character.getNumericValue(number.charAt(i));
            if (value != 0) {
                cnt = (n % value == 0) ? cnt + 1 : cnt;
            }
        }
        return cnt;
    }
}
