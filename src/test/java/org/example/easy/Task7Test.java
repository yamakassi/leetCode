package org.example.easy;

import org.example.medium.Task7;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    Task7 task7;

    @BeforeEach
    void init() {
        task7 = new Task7();

    }

    @Test
    public void reverse() {

        assertAll(
                () -> assertEquals(123, task7.reverse(321)),
                () -> assertEquals(-123, task7.reverse(-321)),
                () -> assertEquals(21, task7.reverse(120)),
                () -> assertEquals(0, task7.reverse(0)),
                () -> assertEquals(0, task7.reverse(2147483647), "the value is greater than the maximum "),
                () -> assertEquals(0, task7.reverse(-2147483648), "the value is less than the maximum"),
                () -> assertEquals(646000012, task7.reverse(210000646), "D")

        );
    }
}