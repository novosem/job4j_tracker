package ru.job4j.oop;

public class Surgeon extends Doctor {

    private int yearsOfExpirience;

    public Surgeon(String name, String surname, String education, String birthday, char gender, int yearsOfExpirience) {
        super(name, surname, education, birthday, gender);
        this.yearsOfExpirience = yearsOfExpirience;
    }
}
