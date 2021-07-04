package org.example.algorithms.implementation;

public class ViralAdvertising {
    static int viralAdvertising(int n){
        int cumulativeLikesOn5thDay = 0; int shared = 5; int like = 0;
        for (int i = 0; i < n; i++) {
            like = (int) Math.floor(shared /2);
            shared = like * 3;
            cumulativeLikesOn5thDay += like;
        }
        return cumulativeLikesOn5thDay;
    }

    public static void main(String[] args) {
        System.out.println(ViralAdvertising.viralAdvertising(3));
    }
}
