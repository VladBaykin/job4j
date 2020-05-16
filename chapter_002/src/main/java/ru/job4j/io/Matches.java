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
    static int match = 11;
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Scanner input = new Scanner(System.in);
        System.out.print("Игрок 1, введите имя: ");
        player1.setName(input.nextLine());
        System.out.print("Игрок 2, введите имя: ");
        player2.setName(input.nextLine());

        System.out.println("Игра начинается.");
        System.out.println();

        while (match > 0) {
            deleteMatch(player1);
            deleteMatch(player2);
        }
    }
    public static void deleteMatch(Player player) {
        if (match > 0) {
            System.out.println("Количество спичек: " + match);
            System.out.println();
            System.out.print(player.getName() + ", возмите от 1 до 3 спичек: ");
            Scanner input = new Scanner(System.in);
            int select = Integer.parseInt(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.print("Ошибка! Можно брать от 1 до 3 спичек.");
            } else {
                match = match - select;
            }
            if (match <= 0) {
                System.out.println(player.getName() + " выиграл.");
                System.out.println("Игра окончена.");
            }
        }
    }
}
