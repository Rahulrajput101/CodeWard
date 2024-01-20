public class MajorityElement {
    public int majorElement(int [] nums){

        for(int i =0; i< nums.length; i++){
            int count = 0;
            for(int j = 0; j< nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
                if(count > nums.length/2){
                    return nums[j];
                }
            }

        }


        return -1;
    }
}
