package ru.job4j.oop;

public class Doctor extends Profession {

    private char gender;

    public Doctor(String name, String surname, String education, String birthday, char gender) {
        super(name, surname, education, birthday);
        this.gender = gender;
    }
}
