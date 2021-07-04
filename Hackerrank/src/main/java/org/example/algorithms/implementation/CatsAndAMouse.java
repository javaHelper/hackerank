package org.example.algorithms.implementation;

public class CatsAndAMouse {
    static String catAndMouse(int x, int y, int z) {
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);

        if(a == b){
            return "Mouse C";
        }else if(a > b){
            return "Cat B";
        }else if(a < b){
            return "Cat C";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(CatsAndAMouse.catAndMouse(1,3,2));
    }
}
