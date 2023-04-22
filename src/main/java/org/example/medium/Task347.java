package org.example.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> val = new HashMap<>();
        int[] result = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (val.containsKey(nums[i])) val.put(nums[i], val.get(nums[i]) + 1);
            else val.put(nums[i], 1);
        }
        Set<Integer> res = val.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((x, y) -> y - x))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                )).keySet();
        int count = 0;
        for (Integer i : res) {

            result[count] = i;
            count++;
        }
        return result;

    }
}
