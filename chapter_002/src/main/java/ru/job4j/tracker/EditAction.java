package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return " Edit Item ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
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