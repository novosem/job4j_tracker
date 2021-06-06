package ru.job4j.oop;

public class Engineer extends Profession {

    private String nameOfCollege;

    public Engineer(String name, String surname, String birthday, String education,
                    String nameOfCollege) {
        super(name, surname, education, birthday);
        this.nameOfCollege = nameOfCollege;
    }

    public String getNameOfCollege() {
        return this.nameOfCollege;
    }
}
