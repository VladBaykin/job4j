package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int resultIndex = 0;
        for (int i = 0, j = 0; i < left.length || j < right.length;) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    result[resultIndex] = left[i];
                    i++;
                } else {
                    result[resultIndex] = right[j];
                    j++;
                }
            } else if (i < left.length) {
                result[resultIndex] = left[i];
                i++;
            } else if (j < right.length) {
                result[resultIndex] = right[j];
                j++;
            }
            resultIndex++;

        }
        return result;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] result = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4});
        System.out.println(Arrays.toString(result));
    }
}