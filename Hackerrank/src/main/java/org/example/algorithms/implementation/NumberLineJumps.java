package org.example.algorithms.implementation;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v1 < v2){
            return "NO";
        }else{
            for (int i = 0; i < v1 * x2; i++) {
                if(x1 + (v1 * i) == x2 + (v2 * i)){
                    return "YES";
                }
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        System.out.println(NumberLineJumps.kangaroo(0,3,4,2));
    }
}
