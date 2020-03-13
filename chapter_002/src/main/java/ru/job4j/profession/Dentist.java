package ru.job4j.profession;

public class Dentist extends Doctor {
    private int experience;

    public Dentist(String name, String surname, String education, String birthday,
                   String hospital, int experience) {
        super(name, surname, education, birthday, hospital);
        this.experience = experience;
    }

    public void treatTeeth() {
    }
}