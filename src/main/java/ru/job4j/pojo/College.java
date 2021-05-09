package ru.job4j.pojo;

import java.time.LocalDate;
import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Aleksey Semin");
        student.setGroup("Main");
        student.setCreated(new Date());
        System.out.println(student.getName() + " has entered a group " + student.getGroup() + " in "
                + student.getCreated());
    }
}
