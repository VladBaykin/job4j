package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public static List<Integer> convert(Integer[][] numbers) {
        return Stream.of(numbers)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
