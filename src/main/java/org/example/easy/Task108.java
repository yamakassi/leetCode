package org.example.easy;

public class Task108 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            TreeNode rootNods = calcSubBTS(nums, 0, nums.length - 1);
            return rootNods;
        }

        private TreeNode calcSubBTS(int[] nums, int start, int end) {
            if (start > end){
                return null;
            }

            int middle = (end + start) / 2;
            TreeNode midNode = new TreeNode(nums[middle]);
            midNode.left = calcSubBTS(nums, start, middle - 1);
            midNode.right = calcSubBTS(nums, middle + 1, end);

            return midNode;

        }
    }
}
