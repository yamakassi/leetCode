package org.example.medium;

import org.example.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Task1315 {
    int sumsEvenGrandparent=0;
    List<Integer> nodeValue=new ArrayList<>();


    public int sumEvenGrandparent(TreeNode root) {
        dfs(root, 0);

        return sumsEvenGrandparent;

    }
    public void dfs(TreeNode node, int lvl) {
        nodeValue.add(node.val);
        if(lvl>1){

            if(node.val==5) System.out.println(nodeValue);

            if(nodeValue.get(nodeValue.size()-3)%2==0){
                sumsEvenGrandparent+=node.val;
            }

        }
        if(node.left!=null) dfs(node.left,lvl+1);
        if(node.right!=null) dfs(node.right,lvl+1);
    nodeValue.remove(nodeValue.size()-1);
    }
}
