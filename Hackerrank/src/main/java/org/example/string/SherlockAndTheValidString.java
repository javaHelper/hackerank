package org.example.string;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SherlockAndTheValidString {
    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));
    }

    static String isValid(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 'a']++;

        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        for (int count : arr)
            if (count > 0)
                map.compute(count, (key, value) -> value != null ? value + 1 : 1);

        if (map.size() == 1)
            return "YES";
        if (map.size() > 2)
            return "NO";

        Iterator<Integer> it = map.keySet().iterator();
        int key1 = it.next();
        int key2 = it.next();
        return key1 - 1 == key2 && map.get(key1) == 1 || map.get(key2) == 1 ? "YES" : "NO";
    }
}
