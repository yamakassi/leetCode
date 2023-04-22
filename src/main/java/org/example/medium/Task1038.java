package org.example.medium;

import org.example.util.TreeNode;

public class Task1038 {
    int rightSum = 0;

    //List<Integer> nodeValue=new ArrayList<>();
    public TreeNode bstToGst(TreeNode root) {

        dfs(root);
        return root;
    }

    public void dfs(TreeNode node) {

        if (node.right != null) dfs(node.right);
        rightSum += node.val;
        node.val = rightSum;
        if (node.left != null) {

            //   rightSum+=node.val;
            dfs(node.left);

        }


    }
}
