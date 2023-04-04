package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    Task14 task14;

    @BeforeEach
    void init() {
        task14 = new Task14();

    }
    @Test
    void longestCommonPrefix() {

            assertAll(
                    () -> assertEquals("car", task14.longestCommonPrefix( new String[]{"car"})),
                   () -> assertEquals("", task14.longestCommonPrefix( new String[]{""})),
                   () -> assertEquals("", task14.longestCommonPrefix( new String[]{})),
                   () -> assertEquals("", task14.longestCommonPrefix( new String[]{"dog","racecar","car"})),
                   () -> assertEquals("fl", task14.longestCommonPrefix( new String[]{"flower","flow","flight"})),
                   () -> assertEquals("", task14.longestCommonPrefix( null))
            );

    }
}