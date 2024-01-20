public class RemoveDupicateArray {
//    public int removeDuplicates(int[] nums) {
//        int k = 1;
//        for( int i = 0; i<nums.length; i++){
//            for(int j = i+1; j<nums.length; j++){
//                if(nums[i] != nums[j]){
//                    nums[k] = nums[j];
//                    k++;
//                }
//            }
//
//        }
//        return k;
//    }
    public int removeDuplicates(int[] nums) {

        int k=0;
        int current = 0;

        if(nums.length > 0){
            current = nums[0];
            k = 1;
        }

        for(int i = 0; i<nums.length; i++){
            if(current == nums[i]){
                continue;
            }

            nums[k] = nums[i];
            current = nums[i];
            k++;
        }

        return k;
    }


    public int removeDuplicates2(int[] nums){
        int k = 0;
        int current = 0;
        if(nums.length > 0){
            current = nums[0];
            k =1;
        }

        for(int i = 0; i <nums.length; i++){
            if(current == nums[i]){
                continue;
            }
            nums[k] = nums[i];
            current = nums[i];
            k++;

        }
        return k;
    }
}
