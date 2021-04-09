package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String[] originArray = origin.split("[.,!:;? ]");
        String[] lineArray = line.split("[.,!:;? ]");
        Set<String> words = new HashSet<>(Arrays.asList(originArray));
        for (String s : lineArray) {
            if (!words.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
