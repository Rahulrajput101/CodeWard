package heap;

import org.jetbrains.annotations.NotNull;

import java.util.PriorityQueue;

public class MinimumCostToConnectNRopes {



    public int minCostToReturnMain(int [] ropes){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost = 0;
        while (pq.size() >1){
            int min = pq.remove();
            int min2 = pq.remove();
            int length = min+min2;
            cost += min+min2;
            pq.add(length);
        }
     return cost;
    }
}
