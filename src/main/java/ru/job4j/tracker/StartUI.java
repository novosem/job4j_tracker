package ru.job4j.tracker;


import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] allItem = tracker.findAll();
                for (Item item : allItem) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("Enter Id to edit:");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter new Name:");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Edit complete");
                } else {
                    System.out.println("No id found");
                }
            } else if (select == 3) {
                System.out.println("Enter Id:");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Id = " + id + " deleted");
                } else {
                    System.out.println("No id found");
                }
            }else  if (select == 4) {
                System.out.println("Enter Id:");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("No id found");
                }
            } else  if (select == 5) {
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                if (item.length > 0) {
                    for (Item value : item) {
                        System.out.println(value);
                    }
                } else {
                    System.out.println("Entered name not found");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new items");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
