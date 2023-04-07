package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task771Test {

    Task771 task771;

    @BeforeEach
    void init() {
        task771 = new Task771();

    }

    @Test
    void numJewelsInStones() {
        assertAll(
                () -> assertEquals(3, task771.numJewelsInStones("aA", "aAABBBB")),
                () -> assertEquals(7, task771.numJewelsInStones("aAB", "aAABBBB")),
                () -> assertEquals(0, task771.numJewelsInStones("z", "ZZ"))
        );

    }
}