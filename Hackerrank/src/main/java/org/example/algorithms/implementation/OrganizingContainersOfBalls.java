package org.example.algorithms.implementation;

import java.util.LinkedList;
import java.util.List;

// TODO
public class OrganizingContainersOfBalls {
    public static void main(String[] args) {
        //System.out.println(organizingContainers());
    }

    public static String organizingContainers(List<List<Integer>> container) {
        int[][] nArray = container.stream().map(a -> a.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        LinkedList<Integer> containers = new LinkedList<>();
        LinkedList<Integer> balls = new LinkedList<>();
        for (int i = 0; i < nArray.length; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < nArray.length; j++) {
                rowSum += nArray[i][j];
                colSum += nArray[j][i];
            }
            balls.add(colSum);
            containers.add(rowSum);
        }

        // Check if the two bags are equal
        containers.removeAll(balls);
        if (containers.isEmpty())
            return "Possible";
        else
            return "Impossible";
    }
}
