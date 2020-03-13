package ru.job4j.profession;

public class Surgeon extends Doctor {
    private int operatingRoom;

    public Surgeon(String name, String surname, String education, String birthday,
                   String hospital, int operatingRoom) {
        super(name, surname, education, birthday, hospital);
        this.operatingRoom = operatingRoom;
    }

    public void operate() {
    }
}