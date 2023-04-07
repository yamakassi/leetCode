package org.example.easy;

import java.util.HashSet;
import java.util.Set;

public class Task217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        Set<Integer> unNums = new HashSet<>();
        unNums.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (unNums.contains(nums[i])) return true;
            unNums.add(nums[i]);
        }
        return false;
    }
}
