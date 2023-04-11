package org.example.easy;

import org.example.medium.Task1315;
import org.example.util.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task104Test {

    Task104 task104;

    @BeforeEach
    void init() {
        task104 = new Task104();

    }
    @Test
    void sumEvenGrandparent() {
        //Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
        TreeNode nodeDepth4 =new TreeNode(6,new TreeNode(7,new TreeNode(2,new TreeNode(9),null),new TreeNode(7,new TreeNode(1),new TreeNode(4))),new TreeNode(8,new TreeNode(1),new TreeNode(3,new TreeNode(5),new TreeNode())));
        TreeNode nodeDepth3 =new TreeNode(3,new TreeNode(9),new TreeNode(8,new TreeNode(1),new TreeNode(3)));
        TreeNode nodeDepth2 = new TreeNode(3,new TreeNode(1), new TreeNode(1));
        TreeNode nodeDepth1 = new TreeNode(1);
        assertAll(
                () -> assertEquals(4, task104.maxDepth(nodeDepth4)),
                () -> assertEquals(3, task104.maxDepth(nodeDepth3)),
                () -> assertEquals(2, task104.maxDepth(nodeDepth2)),
                () -> assertEquals(1, task104.maxDepth(nodeDepth1))
        );
    }
}