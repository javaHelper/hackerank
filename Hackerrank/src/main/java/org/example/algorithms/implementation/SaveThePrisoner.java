package org.example.algorithms.implementation;

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s){
        int prisoner = n, sweets = m, startChair = s;
        int r = sweets % prisoner;
        if ((r + startChair - 1) % prisoner == 0) {
            return prisoner;
        } else {
            return ((r + startChair - 1) % prisoner);
        }
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7,19,2));
    }
}
