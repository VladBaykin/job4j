package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Поехали!");
    }

    @Override
    public void passengers(int pass) {
        System.out.println("Количество пассажиров: " + pass);
    }

    @Override
    public int fuelPrice(int liter) {
        int price = 45;
        return liter * price;
    }
}