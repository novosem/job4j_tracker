package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int level) {
        this.load = level;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery number1 = new Battery(10);
        Battery number2 = new Battery(15);
        number1.exchange(number2);
        System.out.println(number1.load + "  " + number2.load);
    }
}
