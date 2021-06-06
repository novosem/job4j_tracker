package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void compareTo() {
        List<Item> items = Arrays.asList(
                new Item(2, "QQQ"),
                new Item(3, "WWW"),
                new Item(1, "TTT")
        );
        Collections.sort(items);
        List<Item> item = Arrays.asList(
                new Item(1, "TTT"),
                new Item(2, "QQQ"),
                new Item(3, "WWW")
        );
        assertThat(items, is(item));
    }

    @Test
    public void compareToBack() {
        List<Item> items = Arrays.asList(
                new Item(2, "QQQ"),
                new Item(3, "WWW"),
                new Item(1, "TTT")
        );
        items.sort(Collections.reverseOrder());
        List<Item> item = Arrays.asList(
                new Item(3, "WWW"),
                new Item(2, "QQQ"),
                new Item(1, "TTT")
        );
        assertThat(items, is(item));
    }
}