package org.example.string;

public class Pangrams {

    public static String pangrams(String s) {
        String lowercase = s.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if(lowercase.indexOf(letter) < 0){
                return "not pangram";
            }
        }
        return "pangram";
    }

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }
}
