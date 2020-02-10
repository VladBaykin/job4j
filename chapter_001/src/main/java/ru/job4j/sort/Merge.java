package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[index] = left[i];
                i++;
            } else {
                result[index] = right[j];
                j++;
            }
            index++;
        }
        while (i < left.length) {
            result[index] = left[i];
            index++;
            i++;
        }
        while (j < right.length) {
            result[index] = right[j];
            index++;
            j++;
        }
        /* for (int i = 0, j = 0; i < left.length || j < right.length;) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    result[index] = left[i];
                    i++;
                } else {
                    result[index] = right[j];
                    j++;
                }
            } else if (i < left.length) {
                result[index] = left[i];
                i++;
            } else if (j < right.length) {
                result[index] = right[j];
                j++;
            }
            index++;

        }
         */
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