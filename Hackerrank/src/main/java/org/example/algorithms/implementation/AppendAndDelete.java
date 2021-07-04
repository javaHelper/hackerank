package org.example.algorithms.implementation;

public class AppendAndDelete {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("ashley", "ash", 2));
    }

    static String appendAndDelete(String s, String t, int k) {
        int i = 0;
        while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i)) { i++; }
        int toChange = (s.length() - i) + (t.length() - i);
        if (toChange % 2 == 1 && k % 2 == 0) {
            return "No";
        }

        if (toChange > k) {
            return "No";
        }

        return "Yes";
    }
}
