package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1470Test {

    Task1470 task1470;

    @BeforeEach
    void init() {
        task1470 = new Task1470();

    }

    @Test
    void containsDuplicate() {
        assertAll(
                () -> assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, task1470.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)),
                () -> assertArrayEquals(new int[]{1, 2}, task1470.shuffle(new int[]{1, 2}, 1)),
                () -> assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, task1470.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3))

      );
    }
}