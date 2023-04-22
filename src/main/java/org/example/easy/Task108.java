package org.example.easy;

import org.example.util.TreeNode;

public class Task108 {


    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            TreeNode rootNods = calcSubBTS(nums, 0, nums.length - 1);
            return rootNods;
        }

        private TreeNode calcSubBTS(int[] nums, int start, int end) {
            if (start > end) {
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
