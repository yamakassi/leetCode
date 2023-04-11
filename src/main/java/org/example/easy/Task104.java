package org.example.easy;

import org.example.util.TreeNode;

public class Task104 {
    private int maxLvl = 0;

    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return 1+maxLvl;
    }

    private void dfs(TreeNode node, int lvl) {
        if(node==null) return;
        if (lvl > maxLvl) maxLvl = lvl;
        if (node.left != null) dfs(node.left, lvl + 1);
        if (node.right != null) dfs(node.right, lvl + 1);

    }

}
