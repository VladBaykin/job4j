package ru.job4j.poly;

public interface Transport {
    void go();
    void passengers(int pass);
    int fuelPrice(int liter);
}