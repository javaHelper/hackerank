package org.example.string;

public class GameOfThronesI {
    public static void main(String[] args) {
        System.out.println(gameOfThrones("aaabbbb"));
    }

    static String gameOfThrones(String s) {
        int[] cache = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cache[((int) s.charAt(i)) - 97]++;
        }

        boolean isFirstOne = false;
        boolean canHaveOne = (s.length() % 2 == 0) ? false : true;
        for (int i = 0; i < 26; i++) {
            if (cache[i] % 2 != 0 && !canHaveOne) {
                return "NO";
            }

            if (cache[i] % 2 != 0 && isFirstOne) {
                return "NO";
            }

            if (cache[i] % 2 != 0 && canHaveOne) {
                isFirstOne = true;
            }
        }

        return "YES";
    }
}
