package org.example.algorithms.implementation;

//TODO - Not working locally
public class HappyLadybugs {
    static String happyLadybugs(String b) {
        b = b.toLowerCase();
        boolean canSwap = false;
        boolean isEmpty = true;
        int[] chars = new int[26];
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '_') {
                canSwap = true;
            } else {
                chars[((int) b.charAt(i)) - 97]++;
                isEmpty = false;
            }
        }
        if (isEmpty) {
            return "YES";
        }
        if (b.length() <= 1) {
            return "NO";
        }
        for (int i = 0; i < 26; i++) {
            if (chars[i] == 1) {
                return "NO";
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (i == 0) {
                if (b.charAt(i) != b.charAt(i + 1) && !canSwap) {
                    return "NO";
                }
            } else if (i == b.length() - 1) {
                if (b.charAt(i) != b.charAt(i - 1) && !canSwap) {
                    return "NO";
                }
            } else {
                if (b.charAt(i) != b.charAt(i - 1) && b.charAt(i) != b.charAt(i + 1) && !canSwap) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(happyLadybugs("4"));
        System.out.println(happyLadybugs("7"));
        System.out.println(happyLadybugs("RBY_YBR"));
        System.out.println(happyLadybugs("6"));
        System.out.println(happyLadybugs("X_Y__X"));
        System.out.println(happyLadybugs("2"));
        System.out.println(happyLadybugs("--"));
        System.out.println(happyLadybugs("6"));
        System.out.println(happyLadybugs("B_RRBR"));
    }
}
