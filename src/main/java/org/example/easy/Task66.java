package org.example.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 66 plus one
public class Task66 {
    public int[] plusOne(int[] digits) {
        if (digits.length < 1 || digits.length > 100) throw new IllegalArgumentException("over length digits");
        // List<Integer> arrDigits = new ArrayList<>();
        // [9 9 9 9]
        // [1 0 0 0 0]
        int index = digits.length - 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;


        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}

