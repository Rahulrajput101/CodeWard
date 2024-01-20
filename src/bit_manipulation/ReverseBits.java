package bit_manipulation;

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0 ;

        for( int i =0; i<32; i++){
            int rightMostBit = n &1;
            int reverseRightMostBit = rightMostBit <<(31 - i);
            result = result | reverseRightMostBit;
            n = n>>1;
        }
        return result;
    }
}
