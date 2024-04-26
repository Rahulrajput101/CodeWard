package Arrays;

public class ArrayMain {

    public static void main(String[] args){
       // int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int [] height = {4,2,0,6,3,2,5};
        TappedRainWater tappedRainWater = new TappedRainWater();
       int result =  tappedRainWater.trappedWaterMain(height);
        System.out.println(result);
    }
}
