package Others;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
//    public int[] twoSum(int[] nums, int target) {
//        int a = 0 ;
//        int b  = nums.length-1;
//        int[] originalNums = Arrays.copyOf(nums, nums.length);
//        int[] arr = new int[2];
//        Arrays.sort(nums);
//        while(a<b){
//            if(nums[a]+nums[b] == target){
//                arr[0] = findIndex(originalNums,nums[a],-1);
//                arr[1] = findIndex(originalNums,nums[b], arr[0]);
//                return arr;
//            }
//            if(nums[a] + nums[b] > target){
//                b--;
//            }else{
//                a++;
//            }
//        }
//        return arr;
//    }
//
//    private int findIndex( int[] arr ,int  target, int excludeIndex){
//        for(int i = 0; i<=arr.length-1; i++){
//            if(arr[i] == target && i != excludeIndex){
//                return i;
//            }
//        }
//        return -1;
//    }

    //this will take 0(nlogn)
    //next->

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

         for(int i = 0;  i<nums.length; i++){
             int compliment =  target - nums[0];

             if(map.containsKey(compliment)){
                 return  new int [] {map.get(compliment), i};
             }

             map.put(nums[i], i);
         }
        return new int[]{-1, -1};
    }

}
