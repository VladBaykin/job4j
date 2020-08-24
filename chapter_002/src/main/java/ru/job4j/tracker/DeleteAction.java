package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return " Delete ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        boolean result = tracker.delete(input.askStr("Enter Id: "));
        if (result) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Id not found!");
        }
        return true;
    }
}