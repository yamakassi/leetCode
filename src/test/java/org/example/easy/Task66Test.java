package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task66Test {

    Task66 task66;

    @BeforeEach
    void init() {
        task66 = new Task66();

    }

    @Test
    void plusOne() {
        assertAll(
                () -> assertArrayEquals(new int[]{3}, task66.plusOne(new int[]{2})),
                () -> assertArrayEquals(new int[]{1, 0}, task66.plusOne(new int[]{9})),
                () -> assertArrayEquals(new int[]{2,7,6,6}, task66.plusOne(new int[]{2, 7, 6, 5})),
                () -> assertArrayEquals(new int[]{2,7,7,0}, task66.plusOne(new int[]{2, 7, 6, 9}))
                );
    }
}