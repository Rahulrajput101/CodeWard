package leetcode75;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {

        //     if(nums[0] ==target || nums[0] > target){
        //         return 0;
        //     }

        //     for( int i = 1; i<nums.length; i++){
        //         if(nums[i] == target){
        //             return i;
        //         }
        //          if(target> nums[i-1] && target<nums[i]){
        //              return i;
        //          }
        //     }

        //     return nums.length;

        // }

        int left = 0;
        int right = nums.length-1;

        while(left <=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }

        return left;
    }
}
