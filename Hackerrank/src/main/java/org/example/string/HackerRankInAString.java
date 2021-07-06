package org.example.string;

public class HackerRankInAString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerrank"));
    }

    public static String hackerrankInString(String s) {
        String str = "hackerrank";
        if (s.length() < str.length())
            return "NO";

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");
    }
}
