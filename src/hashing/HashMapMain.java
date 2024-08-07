package hashing;

import java.util.Arrays;

public class HashMapMain {
    public static void main(String[] args){
//        UnionAndIntersec unionAndIntersec = new UnionAndIntersec();
//        unionAndIntersec.unAndInterMain();

//        FindItineraryFromTickets findItineraryFromTickets = new FindItineraryFromTickets();
//        findItineraryFromTickets.findMain();

//        LargestSubArrayWithSum0 largestSubArrayWithSum0 = new LargestSubArrayWithSum0();
//        largestSubArrayWithSum0.largestSubArrayMain();

        int[] nums = {1,3,1,5,4};
        KDiffPairs kDiffPairs = new KDiffPairs();
        int count = kDiffPairs.findPairs(Arrays.stream(nums).sorted().toArray(),1);
        System.out.println(count);
    }
}
