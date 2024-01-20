public class Test {
    public int [] rotateArray( int [] nums, int  k){

        int [] tempArray = new int[k];

        int n = nums.length;

        for( int i = n-k;  i < n; i++){
            tempArray[i -(n-k)] = nums[i];
        }
        for( int  num : tempArray) {
            System.out.print (num + " ");
        }

//        for(int i = nums.length-1; i>k-1; i--){
//            nums[i] =
//        }

        for(int i = 0; i<k; i++){
            nums[i] = tempArray[i];
        }

     return nums;
    }
}
