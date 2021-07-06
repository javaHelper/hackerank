package org.example.string;

public class SeparateTheNumbers {
    public static void main(String[] args) {
        separateNumbers("1234");
        separateNumbers("91011");
        separateNumbers("99100");
        separateNumbers("101103");
        separateNumbers("010203");
        separateNumbers("13");
        separateNumbers("1");
    }

    static void separateNumbers(String s) {
        String subString = "";
        boolean isValid = false;
        for (int i = 1; i <= s.length() / 2; i++) {
            subString = s.substring(0, i);
            Long num = Long.parseLong(subString);
            String validString = subString;
            while (validString.length() < s.length()) {
                validString += Long.toString(++num);
            }
            if (s.equals(validString)) {
                isValid = true;
                break;
            }
        }
        System.out.println(isValid ? "YES " + subString : "NO");
    }
}
