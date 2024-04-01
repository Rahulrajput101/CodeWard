package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        int totalPairs = 0;
        int lastPairVal = pairs[0][1];
        totalPairs = 1;

        for( int i =1; i<pairs.length; i++){
            if(lastPairVal < pairs[i][0]){
                totalPairs++;
                lastPairVal = pairs[i][1];
            }
        }

        return totalPairs;

    }
}
