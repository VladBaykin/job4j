package ru.job4j.io;

import java.util.Scanner;

class Player {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Matches {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Scanner input = new Scanner(System.in);
        System.out.print("Игрок 1, введите имя: ");
        player1.setName(input.nextLine());
        System.out.print("Игрок 2, введите имя: ");
        player2.setName(input.nextLine());

        int match = 11;
        System.out.println("Игра начинается.");
        System.out.println("Количество спичек: " + match);
        System.out.println();

        while (true) {
            System.out.print(player1.getName() + ", возмите от 1 до 3 спичек: ");
            int select1 = Integer.parseInt(input.nextLine());
            if (select1 < 1 || select1 > 3) {
                System.out.print("Ошибка! Можно брать от 1 до 3 спичек.");
            } else {
                match = match - select1;
            }
            System.out.println();
            System.out.println("Количество спичек: " + match);
            if (match <= 0) {
                System.out.println(player1.getName() + " выиграл.");
                System.out.println("Игра окончена.");
                break;
            }

            System.out.print(player2.getName() + ", возмите от 1 до 3 спичек: ");
            int select2 = Integer.parseInt(input.nextLine());
            if (select2 < 1 || select2 > 3) {
                System.out.print("Ошибка! Можно брать от 1 до 3 спичек.");
            } else {
                match = match - select2;
            }
            System.out.println();
            System.out.println("Количество спичек: " + match);
            if (match <= 0) {
                System.out.println(player2.getName() + " выиграл.");
                System.out.println("Игра окончена.");
                break;
            }
        }
    }
}