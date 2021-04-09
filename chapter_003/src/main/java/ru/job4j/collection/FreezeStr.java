package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        Map<Character, Integer> mapLeftString = new HashMap<>();
        for (Character chr : left.toCharArray()) {
            if (mapLeftString.containsKey(chr)) {
                mapLeftString.put(chr, mapLeftString.get(chr) + 1);
            } else {
                mapLeftString.put(chr, 1);
            }
        }
        for (Character chr : right.toCharArray()) {
            if (mapLeftString.containsKey(chr)) {
                int value = mapLeftString.get(chr) - 1;
                mapLeftString.put(chr, value);
                if (value == 0) {
                    mapLeftString.remove(chr);
                }
            }
        }
        return mapLeftString.isEmpty();
    }
}
