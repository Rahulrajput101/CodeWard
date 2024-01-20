package leetcode75;

public class WaterContainer {
    public int maxArea(int[] height) {

        int maxArea = 0;
        int checkArea = 0;
        int i = 0;
        int j = height.length -1;

        while(i != j){

            int min = Math.min(height[i], height[j]);
            checkArea = min *(j-i);

            if(maxArea < checkArea){
                maxArea = checkArea;
            }

            if(min == height[i]){
                i++;
            }else{
                j--;
            }
        }

        return maxArea;
    }
}
