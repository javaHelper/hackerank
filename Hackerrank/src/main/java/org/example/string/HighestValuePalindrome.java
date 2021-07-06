package org.example.string;

public class HighestValuePalindrome {
    public static void main(String[] args) {
        System.out.println(highestValuePalindrome("4",1,3993));
    }

    static String highestValuePalindrome(String s, int n, int k) {
        int lo = 0;
        int hi = n-1;;
        char[] string = s.toCharArray();
        int diff = 0;

        for(int i=0, j=n-1; i<n/2; i++, j--){
            if (string[i] != string[j]){
                diff++;
            }
        }

        if (diff > k){
            return "-1";
        }

        while(hi >= lo){
            if (k <= 0){
                break;
            }

            if (string[lo] == string[hi]){
                if (k > 1 && (k-2) >= diff && string[lo] != '9'){
                    string[lo] = '9';
                    string[hi] = '9';
                    k-=2;
                }
            }
            else {
                if (k > 1 && (k-2) >= diff-1){
                    if (string[lo] != '9'){
                        string[lo] = '9';
                        k--;
                    }
                    if (string[hi] != '9'){
                        string[hi] = '9';
                        k--;
                    }
                } else {
                    if (string[lo] > string[hi]){
                        string[hi] = string[lo];
                    } else {
                        string[lo] = string[hi];
                    }
                    k--;
                }
                diff--;
            }
            if (lo == hi && k > 0){
                string[lo] = '9';
                k--;
            }
            lo++;
            hi--;
        }

        s = String.valueOf(string);
        return isPalindrome(s) ? s : "-1";
    }

    static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(j > i){
            if (s.charAt(i) == s.charAt(j)){
                i++; j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
