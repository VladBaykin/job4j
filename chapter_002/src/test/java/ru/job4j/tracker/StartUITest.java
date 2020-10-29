package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void createItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertEquals("Item name", tracker.findAll()[0].getName());
    }

    @Test
    public void editItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[]{"0", item.getId(), replacedName, "1"});
        UserAction[] actions = {
                new EditAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertEquals(replacedName, tracker.findById(item.getId()).getName());
    }

    @Test
    public void deleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(new String[]{"0", item.getId(), "1"});
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertEquals("Menu." + System.lineSeparator() +
                "0.  Exit " + System.lineSeparator()
                 + "=== Exit program ===" + System.lineSeparator(), out.toString());
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "6"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("All Items"));
        UserAction[] actions = {
                new CreateAction(out),
                new FindAllAction(out),
                new EditAction(out),
                new DeleteAction(out),
                new FindByIdAction(out),
                new FindByNameAction(out),
                new ExitAction(out),
        };
        new StartUI(out).init(in, tracker, actions);
        assertEquals("Menu." + System.lineSeparator() +
                        "0.  Create " + System.lineSeparator() +
                        "1.  All Items " + System.lineSeparator() +
                        "2.  Edit " + System.lineSeparator() +
                        "3.  Delete " + System.lineSeparator() +
                        "4.  Find by Id " + System.lineSeparator() +
                        "5.  Find by Name " + System.lineSeparator() +
                        "6.  Exit " + System.lineSeparator() +
                        "All Items" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.  Create " + System.lineSeparator() +
                        "1.  All Items " + System.lineSeparator() +
                        "2.  Edit " + System.lineSeparator() +
                        "3.  Delete " + System.lineSeparator() +
                        "4.  Find by Id " + System.lineSeparator() +
                        "5.  Find by Name " + System.lineSeparator() +
                        "6.  Exit " + System.lineSeparator() +
                        "=== Exit program ===" + System.lineSeparator()
                         , out.toString());
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Found by name item"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"5", item.getName(), "6"}
        );
        UserAction[] actions = {
                new CreateAction(out),
                new FindAllAction(out),
                new EditAction(out),
                new DeleteAction(out),
                new FindByIdAction(out),
                new FindByNameAction(out),
                new ExitAction(out),
        };
        new StartUI(out).init(in, tracker, actions);
        assertEquals("Menu." + System.lineSeparator() +
                        "0.  Create " + System.lineSeparator() +
                        "1.  All Items " + System.lineSeparator() +
                        "2.  Edit " + System.lineSeparator() +
                        "3.  Delete " + System.lineSeparator() +
                        "4.  Find by Id " + System.lineSeparator() +
                        "5.  Find by Name " + System.lineSeparator() +
                        "6.  Exit " + System.lineSeparator() +
                        "Found by name item" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.  Create " + System.lineSeparator() +
                        "1.  All Items " + System.lineSeparator() +
                        "2.  Edit " + System.lineSeparator() +
                        "3.  Delete " + System.lineSeparator() +
                        "4.  Find by Id " + System.lineSeparator() +
                        "5.  Find by Name " + System.lineSeparator() +
                        "6.  Exit " + System.lineSeparator() +
                        "=== Exit program ===" + System.lineSeparator()
                         , out.toString());
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Found by ID item"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"4", item.getId(), "6"}
        );
        UserAction[] actions = {
                new CreateAction(out),
                new FindAllAction(out),
                new EditAction(out),
                new DeleteAction(out),
                new FindByIdAction(out),
                new FindByNameAction(out),
                new ExitAction(out),
        };
        new StartUI(out).init(in, tracker, actions);
        assertEquals("Menu." + System.lineSeparator() +
                        "0.  Create " + System.lineSeparator() +
                        "1.  All Items " + System.lineSeparator() +
                        "2.  Edit " + System.lineSeparator() +
                        "3.  Delete " + System.lineSeparator() +
                        "4.  Find by Id " + System.lineSeparator() +
                        "5.  Find by Name " + System.lineSeparator() +
                        "6.  Exit " + System.lineSeparator() +
                        "Found by ID item" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.  Create " + System.lineSeparator() +
                        "1.  All Items " + System.lineSeparator() +
                        "2.  Edit " + System.lineSeparator() +
                        "3.  Delete " + System.lineSeparator() +
                        "4.  Find by Id " + System.lineSeparator() +
                        "5.  Find by Name " + System.lineSeparator() +
                        "6.  Exit " + System.lineSeparator() +
                        "=== Exit program ===" + System.lineSeparator()
                        , out.toString());
    }
}