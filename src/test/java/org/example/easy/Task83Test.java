package org.example.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task83Test {

    Task83 task83;
    Task83.ListNode listNode;

    @BeforeEach
    void init() {
        task83 = new Task83();
        listNode=new Task83.ListNode(0);

    }
    @Test
    void deleteDuplicates() {

        assertAll(
                () -> assertEquals(listNode, task83.deleteDuplicates(listNode))
            );
    }
}