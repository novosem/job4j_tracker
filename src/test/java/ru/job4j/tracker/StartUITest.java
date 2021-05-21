package ru.job4j.tracker;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

   @Test
   public void whenCreateItem() {
      Output out = new StubOutput();
      Input in = new StubInput(
              new String[] {"0", "Item name", "1"}
      );
      Tracker tracker = new Tracker();
      UserAction[] actions = {
              new CreateAction(out),
              new ExitProgramAction(out)
      };
      new StartUI(out).init(in, tracker, actions);
      assertThat(tracker.findAll()[0].getName(), is("Item name"));
   }

   @Test
   public void whenReplaceItem() {
      Output output = new StubOutput();
      Tracker tracker = new Tracker();
      Item item = tracker.add(new Item("Replaced item"));
      String replacedName = "New item name";
      Input in = new StubInput(
              new String[] {"0", String.valueOf(item.getId()), "New item name", "1"}
      );
      UserAction[] actions = {
              new EditItemAction(output),
              new ExitProgramAction(output)
      };
      new StartUI(output).init(in, tracker, actions);
      assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
   }

   @Test
   public void whenDeleteItem() {
      Output output = new StubOutput();
      Tracker tracker = new Tracker();
      Item item = tracker.add(new Item("Deleted item"));
      Input in = new StubInput(
              new String[] {"0", String.valueOf(item.getId()), "1"}
      );
      UserAction[] actions = {
              new DeleteItemAction(output),
              new ExitProgramAction(output)
      };
      new StartUI(output).init(in, tracker, actions);
      assertThat(tracker.findById(item.getId()), is(nullValue()));
   }

   @Test
   public void testShowAllAction() {
      Output out = new StubOutput();
      Tracker tracker = new Tracker();
      Item item = tracker.add(new Item("New item"));
      Input in = new StubInput(new String[]{"0", "1"});
      UserAction[] actions = {new ShowAllAction(out), new ExitProgramAction(out)};
      String ln = System.lineSeparator();
      new StartUI(out).init(in, tracker, actions);
      assertThat(out.toString(), is(
              "Menu." + ln
              + "0. Show all items" + ln
              + "1. Exit program" + ln
              + "=== Show all items ====" + ln
              + item + ln
              + "Menu." + ln
              + "0. Show all items" + ln
              + "1. Exit program" + ln
      ));
   }

   @Test
   public void testFindItemByNameAction() {
      Output out = new StubOutput();
      Tracker tracker = new Tracker();
      Item item = tracker.add(new Item("New item"));
      Input in = new StubInput(new String[]{"0", String.valueOf(item.getName()), "1"});
      UserAction[] actions = {new FindItemByNameAction(out), new ExitProgramAction(out)};
      String ln = System.lineSeparator();
      new StartUI(out).init(in, tracker, actions);
      assertThat(out.toString(), is(
              "Menu." + ln
                      + "0. Find items by name" + ln
                      + "1. Exit program" + ln
                      + "=== Find items by name ====" + ln
                      + item + ln
                      + "Menu." + ln
                      + "0. Find items by name" + ln
                      + "1. Exit program" + ln
      ));
   }

   @Test
   public void testFindItemByIdAction() {
      Output out = new StubOutput();
      Tracker tracker = new Tracker();
      Item item = tracker.add(new Item("New item"));
      Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
      UserAction[] actions = {new FindItemByIdAction(out), new ExitProgramAction(out)};
      String ln = System.lineSeparator();
      new StartUI(out).init(in, tracker, actions);
      assertThat(out.toString(), is(
              "Menu." + ln
                      + "0. Find item by id" + ln
                      + "1. Exit program" + ln
                      + "=== Find item by id ====" + ln
                      + item + ln
                      + "Menu." + ln
                      + "0. Find item by id" + ln
                      + "1. Exit program" + ln
      ));
   }

   @Test
   public void whenInvalidExit() {
      Output out = new StubOutput();
      Input in = new StubInput(
              new String[]{"1", "0"}
      );
      Tracker tracker = new Tracker();
      UserAction[] actions = new UserAction[]{
              new ExitProgramAction(out)
      };
      new StartUI(out).init(in, tracker, actions);
      String ln = System.lineSeparator();
      assertThat(out.toString(), is(
              "Menu." + ln
                      + "0. Exit program" + ln
                      + "Wrong input, you can select: 0 .. 0" + ln
                      + "Menu." + ln
                      + "0. Exit program" + ln
              )
      );
   }
}