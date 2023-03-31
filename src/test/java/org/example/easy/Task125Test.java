package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task125Test {
    Task125 task125;

    @BeforeEach
    void init() {
        task125 = new Task125();

    }

    @Test
    public void isPalindrome() {

        assertAll(
                () -> assertEquals(true, task125.isPalindrome("")),
                () -> assertEquals(true, task125.isPalindrome("    ")),
                () -> assertEquals(true, task125.isPalindrome("A man, a plan, a canal: Panama")),
                () -> assertEquals(false, task125.isPalindrome("race a car")),
                () -> assertEquals(false, task125.isPalindrome("pjkpo89jio"))

        );
    }
}