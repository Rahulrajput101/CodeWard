package _2dArray;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting2DArray {

    public  void sorting2DArray(){
        int[] start = {1,3,0,5,8,5};
        int[] end = {6,2,4,7,9,9};

        int[][] activities = new int[start.length][3];

        for( int i = 0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }


       print2DArray(activities);

        //sorting the 3 column using lambda
        Arrays.sort(activities, Comparator.comparingDouble(o ->o[2]));

        System.out.println(" after sorting");
        print2DArray(activities);
    }


    public void print2DArray(int array [][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

}
