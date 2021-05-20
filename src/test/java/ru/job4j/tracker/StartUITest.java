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

}