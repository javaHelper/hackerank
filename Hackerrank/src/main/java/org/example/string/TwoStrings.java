package org.example.string;

import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        Set<Character> set = s2.chars()
                .mapToObj(c -> Character.valueOf((char)c))
                .collect(Collectors.toSet());

        for (int i=0; i<s1.length(); i++) {
            char c = s1.charAt(i);
            if (set.contains(c))
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
    }
}
