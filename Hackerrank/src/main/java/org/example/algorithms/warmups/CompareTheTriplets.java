package org.example.algorithms.warmups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] ia = a.stream().mapToInt(Integer::intValue).toArray();
        int[] ib = b.stream().mapToInt(Integer::intValue).toArray();

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < ia.length; i++){
            if(ia[i] > ib[i]){
                alice++;
            }else if(ia[i] < ib[i]){
                bob++;
            }
        }
        List<Integer> values = new ArrayList<>();
        values.add(alice);
        values.add(bob);
        return values;
    }
    
    public static void main(String[] args) {
        System.out.println(CompareTheTriplets.compareTriplets(Arrays.asList(17,28,30),
                Arrays.asList(99,16,8)));
    }
}
