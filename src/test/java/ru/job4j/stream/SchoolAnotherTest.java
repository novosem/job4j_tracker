package ru.job4j.stream;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolAnotherTest {

    @Test
    public void collect() {
        List<Student> students = List.of(
                new Student(80, "Surname2"),
                new Student(30, "Surname3"),
                new Student(50, "Surname2"),
                new Student(60, "Surname6"),
                new Student(20, "Surname2")
        );
        SchoolAnother ss = new SchoolAnother();
        Map<String, Student> rsl = ss.collectt(students);
        Map<String, Student> expected = Map.of("Surname2", new Student(20, "Surname2"),
        "Surname3", new Student(30, "Surname3"),
        "Surname6", new Student(60, "Surname6"));
        assertEquals(rsl, expected);
    }
}