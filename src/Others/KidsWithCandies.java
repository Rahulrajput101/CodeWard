package Others;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> hasExtraCandies = new ArrayList<>();
        int largest = 0;
        for(int i = 0; i<candies.length;i++){
            if(candies[i] > largest){
                largest = candies[i];
            }
        }

        for(int i =0; i<candies.length; i++){
            if(candies[i]+extraCandies >= largest){
                hasExtraCandies.add(true);
            }else{
               hasExtraCandies.add(false);
            }
        }

        return hasExtraCandies;


    }
}
