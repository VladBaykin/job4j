package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void startWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void startWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startWith(word, pref);
        assertThat(result, is(false));
    }
}