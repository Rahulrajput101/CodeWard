package hashing;

import java.util.HashMap;
import java.util.Set;

public class MajorityElements { //0(n)
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        for( Integer key : mp.keySet()){
            if(mp.get(key) > nums.length/2){
                return key;
            }
        }
        return -1;
    }
}
