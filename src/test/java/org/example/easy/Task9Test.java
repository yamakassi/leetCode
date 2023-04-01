package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    Task9 task9;

    @BeforeEach
    void init() {
        task9 = new Task9();
    }

    @Test
    void isPalindrome() {
        assertAll(
                () -> assertTrue( task9.isPalindrome(121)),
                () -> assertFalse( task9.isPalindrome(-121)),
                () -> assertTrue( task9.isPalindrome(0)),
                () -> assertTrue( task9.isPalindrome(1234321)),
                () -> assertTrue( task9.isPalindrome(12221)),
                () -> assertFalse(task9.isPalindrome(129987221))

                );
    }
}
