package ru.job4j.oop;

public class Builder extends Engineer {

    private String specialization;

    public Builder(String name, String surname, String education, String birthday,
                   String nameOfCollege, String specialization) {
        super(name, surname, education, birthday, nameOfCollege);
        this.specialization = specialization;
    }
}
