package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FracKnapsnack {


    public void fractionalKnapsnackMain(){

        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;
        double[][] ratio = new double[val.length][2];

        for(int i =0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] /weight[i];
        }

        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

            for (int i = 0; i < ratio.length; i++) {
                for (int j = 0; j < ratio[i].length; j++) {
                    System.out.print(ratio[i][j] + " ");
                }
                System.out.println(); // Move to the next line after printing each row
            }


        int capacity = W;
        int finalValue = 0;

        for(int i =val.length-1; i>=0; i--){
            int idx = (int) ratio[i][0];
              if(capacity >= weight[idx]){ //include full item
                  finalValue += val[idx];
                  capacity  = capacity - weight[idx];
              }else{
                  //include fractional item
                  finalValue = finalValue +  (int) (ratio[i][1] * capacity);
                  capacity = 0;
                  break;
              }
        }

        System.out.println(finalValue);
    }

}
