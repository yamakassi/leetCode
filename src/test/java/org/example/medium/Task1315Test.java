package org.example.medium;

import org.example.easy.Task1;
import org.example.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1315Test {
    Task1315 task1315;

    @BeforeEach
    void init() {
        task1315 = new Task1315();

    }
    @Test
    void sumEvenGrandparent() {
        //Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
        TreeNode node =new TreeNode(6,new TreeNode(7,new TreeNode(2,new TreeNode(9),null),new TreeNode(7,new TreeNode(1),new TreeNode(4))),new TreeNode(8,new TreeNode(1),new TreeNode(3,new TreeNode(5),new TreeNode())));
        assertAll(
                () -> assertEquals(18, task1315.sumEvenGrandparent(node))
         );
    }
}