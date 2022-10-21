package ru.job4j.oop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int rsl = Max.max(one, two);
        int expected = 2;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenMax1And2And3Then3() {
        int one = 1;
        int two = 2;
        int three = 3;
        int rsl = Max.max(one, two, three);
        int expected = 3;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenMax1And2And3And4Then4() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int rsl = Max.max(one, two, three, four);
        int expected = 4;
        Assert.assertEquals(rsl, expected);
    }
}