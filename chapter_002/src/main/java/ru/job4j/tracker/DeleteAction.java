package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return " Delete Item ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean result = tracker.delete(input.askStr("Enter Id: "));
        if (result) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Id not found!");
        }
        return true;
    }
}