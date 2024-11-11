package graphs;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgoritm {

     class Pair implements Comparable<Pair>{
        int v;
        int c;  //cost

        public Pair(int v, int c){
            this.v = v;
            this.c = c;
        }

        @Override
        public int compareTo(@NotNull Pair p2) {
            return this.c - p2.c;
        }
    }

    public  void primsMain(ArrayList<CreateGraph.Edge>[] graph ){
        boolean [] visit = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int finalCost = 0;  // total cost / total min weight
        pq.add(new Pair(0,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if (!visit[curr.v]){
                visit[curr.v] = true;
                finalCost += curr.c;

                for (int  i =0; i<graph[curr.v].size(); i++){
                    CreateGraph.Edge edge = graph[curr.v].get(i);
                    pq.add(new Pair(edge.dst, edge.wt));
                }
            }
        }

        System.out.println("final cost is " + finalCost);
    }
}
