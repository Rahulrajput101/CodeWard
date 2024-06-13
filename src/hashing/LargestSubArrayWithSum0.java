package hashing;

import java.util.HashMap;

public class LargestSubArrayWithSum0 { // 0(n)
    public void largestSubArrayMain(){
        int [] arr = {15,-2,2,-8,1,7,10,23};
        int length = 0;
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int j =0 ; j<arr.length; j++){
            sum += arr[j];
            if (hm.containsKey(sum)){
                length = Math.max(length,j-hm.get(sum));
            }else{
                hm.put(sum,j);
            }
        }
        System.out.println("largest length of subArray with sum as  0 is :" + length);
    }
}
