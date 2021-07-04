package org.example.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrades = new ArrayList<>();
        for (Integer g : grades) {
            if (g < 38 || g % 5 < 3) {
                newGrades.add(g);
            } else {
                newGrades.add(g + (5 - (g % 5)));
            }
        }
        return newGrades;
    }

    public static void main(String[] args) {
        System.out.println(GradingStudents.gradingStudents(Arrays.asList(73, 67, 38, 33)));
    }
}
