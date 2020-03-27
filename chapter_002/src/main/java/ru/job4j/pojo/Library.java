package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 350);
        Book book2 = new Book("Effective Java", 454);
        Book book3 = new Book("Java. The Complete Reference.", 989);
        Book book4 = new Book("Head First Java", 500);
        Book[] libr = new Book[4];
        libr[0] = book1;
        libr[1] = book2;
        libr[2] = book3;
        libr[3] = book4;

        for (Book bk : libr) {
            System.out.println(bk.getName() + " - " + bk.getCountPage());
        }
        System.out.println();

        Book temp;
        temp = libr[0];
        libr[0] = libr[3];
        libr[3] = temp;

        for (Book bk : libr) {
            System.out.println(bk.getName() + " - " + bk.getCountPage());
        }
        System.out.println();

        for (Book bk : libr) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCountPage());
            }
        }

    }
}