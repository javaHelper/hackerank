package org.example;

public class BeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        int beautifulDay = 0;
        for (int k2 = i; k2 <= j; k2++) {
            if (Math.abs(k2 - reversDigits(k2)) % k == 0) {
                beautifulDay++;
            }
        }
        return beautifulDay;
    }
    static int reversDigits(int num) {
        int rNumber = 0;
        while (num > 0) {
            rNumber = rNumber * 10 + num % 10;
            num = num / 10;
        }
        return rNumber;
    }
    public static void main(String[] args) {
        System.out.println(BeautifulDaysAtTheMovies.beautifulDays(20,23,6));
    }
}
