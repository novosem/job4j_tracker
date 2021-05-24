package ru.job4j.ooa;

public class Airbus extends Aircraft{

    private final int COUNT_ENGINE;

    private String name;



    public Airbus(String name) {
        this.name = name;
        if (name.equals("A380")) {
            COUNT_ENGINE = 4;
        } else {
            COUNT_ENGINE = 2;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
