package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    private PosterManager manager = new PosterManager();
    private Film first = new Film(1, "pict1", "AAA", "XXX");
    private Film second = new Film(2, "pict2", "BBB", "ZZZ");
    private Film third = new Film(3, "pict3", "QQQ", "YYY");
    private Film fourth = new Film(4, "pict4", "DDD", "CCC");
    private Film fifth = new Film(5, "pict5", "EEE", "XXX");
    private Film sixth = new Film(6, "pict6", "KKK", "CCC");
    private Film seventh = new Film(7, "pict7", "LLL", "ZZZ");
    private Film eighth = new Film(8, "pict8", "NNN", "YYY");
    private Film ninth = new Film(9, "pict9", "VVV", "XXX");
    private Film tenth = new Film(10, "pict10", "WWW", "YYY");
    private Film eleventh = new Film(11, "pict11", "MMM", "ZZZ");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

    }

    @Test
    void addUpTen() {
        manager.add(eleventh);
        Film[] actual = manager.lastFilm(10);
        Film[] expected = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void deleteFilmTen() {
        manager.deleteFilm(10);
        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
        // manager.add(tenth);
    void addTenth() {
        manager.add(tenth);
        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
        // manager.add(sixth);
        // manager.add(seventh);
        // manager.add(eighth);
        // manager.add(ninth);
        // manager.add(tenth);

    void addLessTenth() {
        manager.add(sixth);
        Film[] actual = manager.lastFilm(10);
        Film[] expected = new Film[]{sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

}