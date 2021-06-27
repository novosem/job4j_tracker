package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collectQ() {
        List<Profile> profiless = List.of(
        new Profile(new Address("Moscow", "Popova", 6, 22)),
        new Profile(new Address("Moscow", "Lenina", 34, 1)),
        new Profile(new Address("Sochi", "Pushkina", 444, 4444)),
        new Profile(new Address("Moscow", "Popova", 6, 22)));
        List<Address> expect = List.of(
                new Address("Moscow", "Popova", 6, 22),
                new Address("Moscow", "Lenina", 34, 1),
                new Address("Sochi", "Pushkina", 444, 4444)
                );
        Profiles rsl = new Profiles();
        List<Address> result = rsl.collect(profiless);
        assertEquals(expect, result);
    }

    @Test
    public void collectQQ() {
        List<Profile> profiless = List.of(
                new Profile(new Address("Moscow", "Popova", 6, 22)),
                new Profile(new Address("Moscow", "Lenina", 34, 1)),
                new Profile(new Address("Moscow", "Popova", 6, 22)));
        List<Address> expect = List.of(
                new Address("Moscow", "Popova", 6, 22),
                new Address("Moscow", "Lenina", 34, 1)
        );
        Profiles rsl = new Profiles();
        List<Address> result = rsl.collect(profiless);
        assertEquals(expect, result);
    }
}