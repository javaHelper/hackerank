package org.example.string;

public class PalindromeIndex {
    static int palindromeIndex(String s) {
        if (isPalindrom(s)) { return -1; }
        int i = 0;
        while (i < s.length() / 2 && s.charAt(i) == s.charAt(s.length() - 1 - i)) {
            i++;
        }
        String left = removeIndex(s, i);
        String right = removeIndex(s, s.length() - 1 - i);
        if (isPalindrom(left)) { return i; }
        if (isPalindrom(right)) { return s.length() - 1 - i; }
        return -1;
    }

    static String removeIndex(String s, int index) {
        String left = s.substring(0, index);
        String right = s.substring(index + 1, s.length());
        return left + right;
    }

    static boolean isPalindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromeIndex("aaab"));
        System.out.println(palindromeIndex("baa"));
        System.out.println(palindromeIndex("aaa"));
    }
}
