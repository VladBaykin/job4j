package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }


    @Override
    public String name() {
        return " Edit ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter id for edit: ");
        Item item = new Item(input.askStr("Enter new item: "));
        if (tracker.replace(id, item)) {
            System.out.println("Item edited");
        } else {
            System.out.println("Id not found!");
        }
        return true;
    }
}