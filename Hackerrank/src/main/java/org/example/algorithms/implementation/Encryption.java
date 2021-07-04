package org.example.algorithms.implementation;

public class Encryption {
    static String encryption(String s) {
        int length = s.length();
        double rows = Math.floor(Math.sqrt(length));
        double cols = Math.ceil(Math.sqrt(length));

        int len = (int) (rows > cols ? rows : cols);

        String result = "";
        for (int i = 0; i < len; i++) {
            for (int j = i; j < s.length(); j = (int) (j + cols)) {
                char ch = s.charAt(j);
                result += ch;
            }
            result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encryption("feed"));
    }
}
