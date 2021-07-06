package org.example.string;

public class StringConstruction {
    public static void main(String[] args) {
        System.out.println(stringConstruction("abcd"));
        System.out.println(stringConstruction("abab"));
    }
    static int stringConstruction(String s) {
        int[] cache = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cache[((int) s.charAt(i)) - 97]++;
        }

        int counter = 0;
        for (int i = 0; i < 26; i++) {
            if (cache[i] != 0) {
                counter++;
            }
        }

        return counter;
    }
}
