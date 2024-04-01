package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoulteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        Arrays.sort(arr);

        int minDifference = Math.abs(arr[1]-arr[0]);
        for( int i = 0; i<arr.length-1; i++){
            minDifference = Math.min(minDifference, arr[i + 1] - arr[i]);
        }

        for(int i =0; i<arr.length-1; i++){
            if(minDifference == Math.abs(arr[i+1] - arr[i])){
                arrayList.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }

        return arrayList;

    }
}
