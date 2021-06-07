package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByName() {
        List<Job> job = Arrays.asList(new Job("Impl task", 0),
        new Job("Fix bug", 1));
        Collections.sort(job, new SortByNameJob());
        List<Job> expect = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(job, is(expect));
    }

    @Test
    public void whenComparatorByPriority() {
        List<Job> job = Arrays.asList(new Job("Impl task", 0),
                new Job("Fix bug", 1));
        Collections.sort(job, new JobDescByPriority());
        List<Job> expect = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(job, is(expect));
    }

    @Test
    public void whenComparatorDescByName() {
        List<Job> job = Arrays.asList(new Job("Impl task", 0),
                new Job("Fix bug", 1));
        Collections.sort(job, new JobDescByName());
        List<Job> expect = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)

        );
        assertThat(job, is(expect));
    }

    @Test
    public void whenComparatorDescByPriority() {
        List<Job> job = Arrays.asList(new Job("Impl task", 0),
                new Job("Fix bug", 1));
        Collections.sort(job);
        List<Job> expect = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)

        );
        assertThat(job, is(expect));
    }

    @Test
    public void whenCompatorSortByNameAndPrority() {
        Comparator<Job> cmpNamePriority =
                new SortByNameJob().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorSortByNameAndSortByPrority() {
        Comparator<Job> cmpNamePriority =
                new SortByNameJob().thenComparing(new JobSortByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, greaterThan(0));
    }
}