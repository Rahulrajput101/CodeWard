package greedy;

import java.util.ArrayList;

//Select the maximum number of activity can be done by person.[person can do activity one at a time]
public class ActivitySelection {

    public void activitySelectionMain(){
       int [] start = {1,3,0,5,8,5 };
       int [] end = {2,4,6,7,8,9,9 };

       int maxAct = 0;
       //activities index
        ArrayList<Integer> act = new ArrayList<>();
        act.add(start[0]);
        maxAct = 1;
        int lastAct = end[0];

        for( int i = 1; i<start.length; i++){
            if(start[i] >= lastAct){
                act.add(start[i]);
                maxAct++;
                lastAct = end[i];
            }
        }
        

        System.out.println(maxAct);
    }

}
