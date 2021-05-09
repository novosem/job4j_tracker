package ru.job4j.oop;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String name, String surname, String education,
                      String birthday, String nameOfCollege, String language) {
        super(name, surname,education, birthday, nameOfCollege);
        this.language = language;
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Alex", "Semin", "high", "1972", "Sinh", "java");
        System.out.println(programmer.getName());
        System.out.println(programmer.language);
    }
}
