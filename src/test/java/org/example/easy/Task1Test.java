package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1;

    @BeforeEach
    void init() {
        task1 = new Task1();

    }/*
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]*/

    @Test
    void twoSum() {
        assertAll(
                () -> assertArrayEquals(new int[]{0, 1}, task1.twoSum(new int[]{2, 7, 11, 15}, 9)),
                () -> assertArrayEquals(new int[]{1, 2}, task1.twoSum(new int[]{3, 2, 4}, 6)),
                () -> assertArrayEquals(new int[]{0, 1}, task1.twoSum(new int[]{3, 3}, 6), "repeat value")

        );
    }
}