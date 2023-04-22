package org.example.medium;


import org.example.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Task1302 {


    List<Integer> sums = new ArrayList<>();

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sums.get(sums.size() - 1);
    }

    public void dfs(TreeNode node, int lvl) {
        if (lvl == sums.size()) sums.add(node.val);
        else {
            sums.set(lvl, sums.get(lvl) + node.val);
        }
        if (node.left != null) dfs(node.left, lvl + 1);
        if (node.right != null) dfs(node.right, lvl + 1);

    }

}
