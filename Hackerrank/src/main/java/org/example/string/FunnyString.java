package org.example.string;

public class FunnyString {
    static String funnyString(String s){
        String r = (new StringBuffer(s)).reverse().toString();
        for (int i = 1; i < s.length(); i++) {
            if (Math.abs(((int)s.charAt(i)) - ((int)s.charAt(i-1))) != Math.abs(((int)r.charAt(i)) - ((int)r.charAt(i-1)))) {
                return "Not Funny";
            }
        }
        return "Funny";
    }

    public static void main(String[] args) {
        System.out.println(funnyString("acxz"));
        System.out.println(funnyString("bcxz"));
    }
}
