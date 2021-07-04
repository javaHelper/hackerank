package org.example.string;

public class CaesarCipher {
    public static String caesarCipher(String s, int myk) {
        int k = myk % 26;
        StringBuilder output = new StringBuilder("");
        for (char letter : s.toCharArray()) {

            //Capital letter
            if (letter > 64 && letter < 91) {
                char encrypted = (char) (letter + k);
                if (encrypted > 90) {
                    encrypted = (char) ((encrypted % 90) + 64);
                }
                output.append(encrypted);
            }
            //Lower case letter
            else if (letter > 96 && letter < 123) {
                char encrypted = (char) (letter + k);
                if (encrypted > 122) {
                    encrypted = (char) ((encrypted % 122) + 96);
                }
                output.append(encrypted);
            }
            //Symbol
            else {
                output.append(letter);
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz",2));
    }
}
