public class Jump {
    public boolean canJump(int[] nums) {




        int n = nums.length-1;
        if(n<=0){
            return true;
        }
        for(int i =0; i<=n; i++){
            int jump = nums[i];
            int diff = n -i;
            System.out.println("diff " + diff +"and" +jump + " :jump " + i +":i");

            if( i+jump >= n){
                return true;
            }

            if(jump == 0){
                System.out.println("o false");
                return false;
            }



        }
        return false;


}
}
