package org.example.string;

public class TwoCharacters {
    static int alternate(String s) {

        int maxPattern = 0;


        if(s.length() == 1){
            return 0;
        }

        int [][] pair = new int[26][26];
        int [][] count = new int[26][26];


        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);

            int letterNum = letter - 'a';

            for(int col = 0; col < 26; col++){
                if(pair[letterNum][col] == letter){
                    count[letterNum][col] = -1;
                }

                if(count[letterNum][col] != -1){
                    pair[letterNum][col] = letter;
                    count[letterNum][col]++;
                }
            }

            for(int row = 0; row < 26; row++){
                if(pair[row][letterNum] == letter){
                    count[row][letterNum] = -1;
                }

                if(count[row][letterNum] != -1){
                    pair[row][letterNum] = letter;
                    count[row][letterNum]++;
                }
            }
        }


        int max = 0;
        for(int row = 0; row < 26; row++){
            for(int col = 0; col < 26; col++){
                max = Math.max(max, count[row][col]);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(alternate("beabeefeab"));
    }
}
