package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnalyzeTest {

    @Test
    public void whenSinglePupil() {
        double average = Analyze.averageScore(
                List.of(new Pupil("Ivanov", List.of(new Subject("Math", 100))))
                .stream()
        );
        assertEquals(100D, average, 0.1);
    }

    @Test
    public void whenPupilAverage() {
        double average = Analyze.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60))))
                .stream()
        );
        assertEquals(80D, average, 0.1);
        }

    @Test
    public void whenListOfPupilAverage() {
        List<Tuple> average = Analyze.averageScoreBySubject(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100),
                                                            new Subject("Lang", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60),
                                                            new Subject("Lang", 60)))
                ).stream()
        );
        List<Tuple> expected = List.of(
                new Tuple("Ivanov", 100D),
                new Tuple("Petrov", 60D));
        assertEquals(expected, average);
    }

    @Test
    public void whenListOfSubjectAverage() {
        List<Tuple> average = Analyze.averageScoreByPupil(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100),
                                                            new Subject("Lang", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60),
                                                             new Subject("Lang", 60)))
                ).stream()
        );
        List<Tuple> expected = List.of(
                new Tuple("Math", 80D),
                new Tuple("Lang", 80D)
        );
        assertEquals(expected, average);
    }

    @Test
    public void whenBestPupil() {
        Tuple best = Analyze.bestStudent(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100),
                                                            new Subject("Lang", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60),
                                                            new Subject("Lang", 60)))
                ).stream()
        );
        assertEquals(new Tuple("Ivanov", 200D), best);
    }

    @Test
    public void whenBestSubject() {
        Tuple best = Analyze.bestSubject(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100),
                                                            new Subject("Lang", 40))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60),
                                                            new Subject("Lang", 60)))
                ).stream()
        );
        assertEquals(new Tuple("Math", 160D), best);
    }
}
