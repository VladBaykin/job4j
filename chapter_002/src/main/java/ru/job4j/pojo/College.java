package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivanov Ivan");
        student.setGroup("jbj-102");
        student.setEnrollment(new Date());
        System.out.println(student.getName() + " was enrolled on group " + student.getGroup()
                            + " " + student.getEnrollment());
    }
}