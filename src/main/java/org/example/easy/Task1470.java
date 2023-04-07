package org.example.easy;

public class Task1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0, k = 0, j = n; j < nums.length; i++, k++, j++) {
            res[i] = nums[k];
            i++;
            res[i] = nums[j];
        }
        return res;
    }
}
