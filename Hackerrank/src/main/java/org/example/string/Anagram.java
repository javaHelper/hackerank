package org.example.string;

public class Anagram {
    static int anagram(String s){
        if (s.length() % 2 != 0) { return -1; }
        int[] cache = new int[70];

        for (int i = 0; i < s.length() / 2; i++) {
            cache[Character.getNumericValue(s.charAt(i))]++;
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            if (cache[Character.getNumericValue(s.charAt(i))] > 0) {
                cache[Character.getNumericValue(s.charAt(i))]--;
            }
        }

        int counter = 0;
        for (int i = 0; i < 70; i++) {
            counter += cache[i];
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(anagram("aaabbb"));
        System.out.println(anagram("ab"));
        System.out.println(anagram("abc"));
        System.out.println(anagram("mnop"));
        System.out.println(anagram("xyyx"));
        System.out.println(anagram("xaxbbbxx"));
    }
}
