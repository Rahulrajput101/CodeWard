package bit_manipulation;

public class CountNumberOf1Bits {
    public int hammingWeight(int n) {
        int result = 0;

        for(int i =0; i<32; i++){
            int lsb = n &1;

            if(lsb ==1){
                result++;
            }

            n =n>>1;
        }

        return result;
    }
}
