package ru.job4j.tracker;


public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    public static void findAllItem(Input input, Tracker tracker) {
        System.out.println("=== All Item ===");
        for (Item item : tracker.findAll()) {
            System.out.println(item.getName());
        }
    }
    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        String id = input.askStr("Enter id for edit: ");
        Item item = new Item(input.askStr("Enter new item: "));
        if (tracker.replace(id, item)) {
            System.out.println("Item edited");
        } else {
            System.out.println("Id not found!");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        boolean result = tracker.delete(input.askStr("Enter Id: "));
        if (result) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Id not found!");
        }
    }
    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Id ===");
        Item item = tracker.findById(input.askStr("Enter Id: "));
        if (item != null) {
            System.out.println("Item found: " + item.getName());
        } else {
            System.out.println("Id not found!");
        }
    }
    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find Items by Name ===");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        if (item.length != 0) {
            for (Item value : item) {
                System.out.println("Name " + value.getName() + " found");
            }
        } else {
            System.out.println("Name " + name + " not found!");
        }
    }
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
               StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}