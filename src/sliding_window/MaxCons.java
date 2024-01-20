package sliding_window;

public class MaxCons {
        public int longestOnes(int[] nums, int k) {
            int count = 0;
            int maxCount = 0;
            int zeroCount = 0;

            for( int i = 0 ; i<nums.length; i++){

                if(nums[i] == 0){
                    zeroCount++;
                    System.out.println(i);
                }else{
                    i++;
                }

            }




            maxCount = count;

            for(int i = count; i<nums.length; i++){
                int addZero =0;
                int subtractZero = 1;
                if(subtractZero > 0){
                    if(nums[i-count] == 0){
                        count = count - (i-count);
                    }
                }

                if(addZero < 1){
                    if(nums[i] == 0){
                        count = count +(i-count);
                        addZero++;
                    }
                }

                if(subtractZero > 0 && addZero < 1){
                    maxCount = Math.max(maxCount, count);
                }

            }

            return maxCount;
        }
}
