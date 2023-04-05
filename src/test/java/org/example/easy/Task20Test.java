package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    Task20 task20;

    @BeforeEach
    void init() {
        task20 = new Task20();

    }
    @Test
    void isValid() {
        assertAll(
                () -> assertTrue( task20.isValid("[](){}")),
               () -> assertTrue( task20.isValid("[]{()}[()()(){}]")),
               () -> assertFalse( task20.isValid("[}")),
               () -> assertFalse( task20.isValid("[")),
               () -> assertFalse( task20.isValid("[[](){]}")),
               () -> assertFalse( task20.isValid("[[](]][){}"))
           );

    }
}