package ru.job4j.oop;

public class Dentist extends Doctor {

    private String region;

    public Dentist(String name, String surname, String education, String birthday, char gender, String region) {
        super(name, surname, education, birthday, gender);
        this.region = region;
    }
}
