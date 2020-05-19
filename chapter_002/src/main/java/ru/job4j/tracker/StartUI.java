package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All Item ===");
                for (Item item : tracker.findAll()) {
                    System.out.println(item.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ===");
                System.out.println("Enter id for edit: ");
                String id = scanner.nextLine();
                System.out.println("Enter new item: ");
                Item item = new Item(scanner.nextLine());
                if (tracker.replace(id, item)) {
                    System.out.println("Item edited");
                } else {
                    System.out.println("Id not found!");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.print("Enter Id: ");
                boolean result = tracker.delete(scanner.nextLine());
                if (result) {
                    System.out.println("Item deleted");
                } else {
                    System.out.println("Id not found!");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ===");
                System.out.print("Enter Id: ");
                Item item = tracker.findById(scanner.nextLine());
                if (item != null) {
                    System.out.println("Item found: " + item.getName());
                } else {
                    System.out.println("Id not found!");
                }
            } else if (select == 5) {
                System.out.println("=== Find Items by Name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                if (item.length != 0) {
                    for (Item value : item) {
                        System.out.println("Name " + value.getName() + " found");
                    }
                } else {
                    System.out.println("Name " + name + " not found!");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit program.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner,tracker);
    }
}