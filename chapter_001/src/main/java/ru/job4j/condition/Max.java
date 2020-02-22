package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        int temp = max(second, third);
        return Math.max(first, temp);
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = max(second, third, fourth);
        return Math.max(first, temp);
    }
}
