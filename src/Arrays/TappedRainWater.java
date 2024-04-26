package Arrays;

public class TappedRainWater {
    public int trappedWaterMain(int [] height){
        int[] leftMax = new int [height.length];
        int[] rightMax =  new int [height.length];

        leftMax[0] = height[0];
        for(int i =1; i<height.length; i++){
            if(height[i]> leftMax[i-1]){
                leftMax[i] = height[i];
            }else{
                leftMax[i] = leftMax[i-1];
            }
        }

        rightMax[height.length-1] = height[height.length-1];

        for(int i = height.length-2; i>=0; i--){
            if(height[i] >rightMax[i+1]){
                rightMax[i]= height[i];
            }else{
                rightMax[i] = rightMax[i+1];
            }
        }
        int minWaterLvl;
        int result =0;
        int trapped =0;
        for(int i = 0; i<height.length; i++ ){

            minWaterLvl =  Math.min(leftMax[i], rightMax[i]);
            trapped = (minWaterLvl - height[i]);
            System.out.println("min water for index "+ i + " the value is "+ minWaterLvl + "and trapped is " + trapped);
            if(trapped >0){
                result += trapped;
            }
        }

        return result;
    }
}
