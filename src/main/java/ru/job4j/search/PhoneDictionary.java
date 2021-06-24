package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> byName = Person -> Person.getName().contains(key);
        Predicate<Person> bySurname = Person -> Person.getSurname().contains(key);
        Predicate<Person> byAdress = Person -> Person.getAddress().contains(key);
        Predicate<Person> byPhone = Person -> Person.getPhone().contains(key);
        Predicate<Person> combine = byName.or(bySurname.or(byAdress.or(byPhone)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
