package hashing;

import kotlin.Pair;
import queue.InterleaveTwoHalves;

import java.util.*;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {

        HashMap<Integer, Boolean> map = new HashMap();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], false);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] + k) && !map.get(nums[i])) {
                set.add(nums[i] +" "+ nums[i+k]);
                map.put(nums[i], true);
            }

            if (map.containsKey(nums[i] - k) && !map.get(nums[i])) {
                set.add(nums[i-k] +" "+ nums[i]);
                map.put(nums[i], true);
            }
        }

        for (String s : set) {
            System.out.println(s);
        }



        return set.size();
    }
}
