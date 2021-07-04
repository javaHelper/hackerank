package org.example.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CavityMap {
    public static List<String> cavityMap(List<String> g) {
        String[] grid = g.toArray(new String[g.size()]);
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length() - 1; j++) {
                Character c = grid[i].charAt(j);
                Character t = grid[i - 1].charAt(j);
                Character b = grid[i + 1].charAt(j);
                Character l = grid[i].charAt(j - 1);
                Character r = grid[i].charAt(j + 1);
                if (c > t && c > b && c > l && c > r) {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for (int i = 0; i < x.size(); i++) {
            grid[x.get(i)] = grid[x.get(i)].substring(0, y.get(i))+ "X" +
                    grid[x.get(i)].substring(y.get(i) + 1, grid[x.get(i)].length());
        }
        return Arrays.asList(grid);
    }

    public static void main(String[] args) {
        System.out.println(cavityMap(Arrays.asList("1112", "1912", "1892", "1234")));
    }
}
