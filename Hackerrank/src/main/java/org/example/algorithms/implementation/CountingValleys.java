package org.example.algorithms.implementation;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int level = 0;
        for (char c : path.toCharArray()){
            if('U' == c)
                level++;
            else if('D' == c)
                level--;

            if(level == 0 && 'U' == c){
                ++valleys;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(CountingValleys.countingValleys(8, "UDDDUDUU"));
    }
}