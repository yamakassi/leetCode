package org.example.easy;

import java.util.HashSet;
import java.util.Set;

public class Task771 {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        Set<Character> uniqJewels = new HashSet<>();

        for (Character c : jewels.toCharArray()) {
            uniqJewels.add(c);
         }
        for (Character c : stones.toCharArray()) {
            if (uniqJewels.contains(c)){
                res++;
            }
        }

        return res;
    }
}
