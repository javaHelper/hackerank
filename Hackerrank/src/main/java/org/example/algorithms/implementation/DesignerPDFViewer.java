package org.example.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class DesignerPDFViewer {

    public static void main(String[] args) {
        System.out.println(DesignerPDFViewer.designerPdfViewer(
                Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7),
                "zaba"));
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        int[] array = h.stream().mapToInt(Integer::intValue).toArray();

        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            if (max < array[word.charAt(i) - 97]) {
                max = array[word.charAt(i) - 97];
            }
        }
        return max * word.length();
    }
}
