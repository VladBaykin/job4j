package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return " Find by Id ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by ID ===");
        Item item = tracker.findById(input.askStr("Enter Id: "));
        if (item != null) {
            out.println("Item found: " + item.getName());
        } else {
            out.println("Id not found!");
        }
        return true;
    }
}