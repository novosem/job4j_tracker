package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book first = new Book("Java", 100);
        Book second = new Book("Pithon", 200);
        Book third = new Book("JS", 150);
        Book fourth = new Book("Clean code", 300);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (Book bk : books) {
            System.out.println(bk.getCount() + " pages in book " + bk.getName());
        }
            Book temp = books[0];
            books[0] = books[3];
            books[3] = temp;

        for (Book bk : books) {
            System.out.println(bk.getCount() + " pages in book " + bk.getName());
        }
        for (Book bk : books) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getCount() + " pages in book " + bk.getName());
            }
        }
    }
}
