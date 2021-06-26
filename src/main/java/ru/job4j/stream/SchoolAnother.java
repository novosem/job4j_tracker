package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SchoolAnother {

    public Map<String, Student> collectt(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(Student::getSurname, student -> student,
                        (f, s) -> s
                ));
    }
}