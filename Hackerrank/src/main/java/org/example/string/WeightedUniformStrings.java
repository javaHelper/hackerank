package org.example.string;

import java.util.*;

public class WeightedUniformStrings {
    public static void main(String[] args) {
        System.out.println(weightedUniformStrings("abccddde", Arrays.asList(6, 1, 3, 12, 5, 9, 10)));
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> q) {
        int[] queries = q.stream().mapToInt(Integer::intValue).toArray();
        Map<Character, String> map = new HashMap<>();
        Arrays.stream(s.split("(?<=(.))(?!\\1)")).forEach(
                group -> map.compute(group.charAt(0), (ch, existed) -> existed == null || group.length() > existed.length() ? group : existed));

        Set<Integer> weights = new HashSet<>();
        map.forEach((ch, group) -> {
            for (int i = 0, sum = 0; i < group.length(); i++)
                weights.add(sum += ch - 'a' + 1);
        });

        String[] res = new String[queries.length];

        for (int i = 0; i < res.length; i++)
            res[i] = weights.contains(queries[i]) ? "Yes" : "No";

        return Arrays.asList(res);
    }
}
