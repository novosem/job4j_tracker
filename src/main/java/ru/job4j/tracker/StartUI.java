package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item(1, "Ivan"));
        tracker.add(new Item(2, "Petya"));
        tracker.add(new Item(4, "Vasya"));
        Item alex = new Item("Alex");
        System.out.println(tracker.findById(4));
        System.out.println(Arrays.toString(tracker.findAll()));
        System.out.println(Arrays.toString(tracker.findByName("Ivan")));
        System.out.println(tracker.replace(2, alex));
    }
}
