package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task217Test {
    Task217 task217;

    @BeforeEach
    void init() {
        task217 = new Task217();

    }

    @Test
    void containsDuplicate() {
        assertAll(
                () -> assertEquals(true, task217.containsDuplicate(new int[]{1, 2, 3, 4, 4})),
                () -> assertEquals(false, task217.containsDuplicate(new int[]{1})),
                () -> assertEquals(false, task217.containsDuplicate(new int[]{})),
                () -> assertEquals(false, task217.containsDuplicate(new int[]{1, 2, 3, 4})),
                () -> assertEquals(true, task217.containsDuplicate(new int[]{1, 1, 1, 4, 1})),
                () -> assertEquals(true, task217.containsDuplicate(new int[]{2, 14, 18, 22, 22}))

        );
    }
}