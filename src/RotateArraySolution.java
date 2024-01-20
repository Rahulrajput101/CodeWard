public class RotateArraySolution {


    public void rotate(int[] nums, int r) {

        int[] tempStartNums = new int[r];

        int k = r % nums.length;

        for(int i=nums.length-k; i<nums.length; i++){
            tempStartNums[i-(nums.length-k)] = nums[i];
        }

        for(int i=nums.length-1; i>k-1; i--){
            nums[i] = nums[i-k];
        }

        for( int  num : nums) {
            System.out.print (num + " ");
        }

        for(int i=0; i<k; i++){
            nums[i] = tempStartNums[i];
        }


//        for( int num : nums){
//            System.out.print(num + "");
//        }





    }

}