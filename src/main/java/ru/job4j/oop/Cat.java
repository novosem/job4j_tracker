package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.food);
    }

    public void showNick() {
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        System.out.println("There is second cat's nick.");
        gav.giveNick("Gav");
        gav.showNick();
        System.out.println("There are gav's food.");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There is first cat's nick.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.showNick();
        System.out.println("There are black's food.");
        black.eat("fish");
        black.show();
    }
}
