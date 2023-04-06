package org.example.easy;

import java.util.HashMap;
import java.util.Map;

//Two sum
public class Task1 {
    //   Input: nums = [2,7,11,15], target = 9
    //           9-2=7
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> value = new HashMap<>();
        value.put(target - nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (value.containsKey(nums[i])) {
                return new int[]{value.get(nums[i]), i};
            } else {
                value.put(target - nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
