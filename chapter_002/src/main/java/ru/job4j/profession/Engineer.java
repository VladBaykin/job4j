package ru.job4j.profession;

public class Engineer extends Profession {
    private String company;

    public Engineer(String name, String surname, String education, String birthday, String company) {
        super(name, surname, education, birthday);
        this.company = company;
    }

    public Project construct() {
        return new Project();
    }
}