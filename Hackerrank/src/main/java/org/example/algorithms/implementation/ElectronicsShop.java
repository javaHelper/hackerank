package org.example.algorithms.implementation;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        //b - budget
        int max = 0, kb = 0, drive = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int temp = keyboards[i] + drives[j];
                if (temp >= max && temp <= b) {
                    kb = i;
                    drive = j;
                    max = temp;
                }
            }
        }
        return (kb == 0 && drive == 0) ? -1 : max;
    }

    public static void main(String[] args) {
        System.out.println(ElectronicsShop.getMoneySpent(new int[]{40, 50, 60}, new int[]{5, 8, 12}, 60));
    }
}
