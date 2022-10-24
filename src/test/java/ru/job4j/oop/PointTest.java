package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    void when00To02Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2;
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when11To22Then2() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        double expected = 1.41;
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when25To43Then2() {
        Point a = new Point(2, 5);
        Point b = new Point(4, 3);
        double out = a.distance(b);
        double expected = 2.82;
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when24To43Then2() {
        Point a = new Point(0, 1, 0);
        Point d = new Point(0, 0, 0);
        double out = a.distance3d(d);
        double expected = 1;
        assertThat(out).isEqualTo(expected, offset(0.01));
    }
}