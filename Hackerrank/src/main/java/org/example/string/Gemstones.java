package org.example.string;

import java.util.Arrays;
import java.util.List;

public class Gemstones {
    static int gemstones(List<String> values){
        String[] arr = values.toArray(new String[values.size()]);
        int cache[] = new int[256];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                int tmp = (int) arr[i].charAt(j);
                if (cache[tmp] == i) {
                    cache[tmp]++;
                }
                if (cache[tmp] == arr.length) {
                    cache[tmp]++;
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(gemstones(Arrays.asList("abcdde", "baccd", "eeabg")));
    }
}
