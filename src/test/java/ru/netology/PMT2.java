package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PMT2 {
    private PosterManager manager = new PosterManager();
    private Film first = new Film(1, "pict1", "AAA", "XXX");
    private Film second = new Film(2, "pict2", "BBB", "ZZZ");
    private Film third = new Film(3, "pict3", "QQQ", "YYY");
    private Film fourth = new Film(4, "pict4", "DDD", "CCC");
    private Film fifth = new Film(5, "pict5", "EEE", "XXX");
    private Film sixth = new Film(6, "pict6", "KKK", "CCC");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

    }
    @Test
    void addLessTenth() {
        manager.add(sixth);
        Film[] actual = manager.lastFilm(10);
        Film[] expected = new Film[]{sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}
