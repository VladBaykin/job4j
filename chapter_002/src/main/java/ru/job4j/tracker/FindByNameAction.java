package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return " Find Items by Name ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        if (item.length != 0) {
            for (Item value : item) {
                System.out.println("Name " + value.getName() + " found");
            }
        } else {
            System.out.println("Name " + name + " not found!");
        }
        return true;
    }
}