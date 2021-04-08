package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, -2, 3, -4);
        List<Integer> positiveNum = num.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
    }
}
