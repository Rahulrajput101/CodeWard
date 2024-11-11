package graphs;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ConnectingCities {

    class Pair implements Comparable<Pair> {
        int v; //vertex or city
        int c;  // cost

        public Pair( int v, int c){
            this.v = v;
            this.c = c;
        }

        @Override
        public int compareTo(@NotNull Pair p2) {
             return this.c-p2.c;
        }
    }

    public void connectCitiesMain(int[][] cites){

        ArrayList<CreateGraph.Edge>[] graph =  new ArrayList[cites.length];

        for (int i = 0; i < cites.length; i++) {
            graph[i] = new ArrayList<>();  // Initialize the ArrayList for each city
        }
        for (int i = 0; i< graph.length; i++){
            for (int j = 0; j<cites[i].length; j++){
                int weight = cites[i][j];
                if (weight != 0){
                    CreateGraph.Edge edge = new CreateGraph.Edge(i,j,weight);
                    graph[i].add(edge);
                }
            }
        }

        boolean[] visit = new boolean[graph.length];


        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int finalCost = 0;
        pq.add(new Pair(0,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if (!visit[curr.v]){
                visit[curr.v] = true;
                finalCost += curr.c;
                for (int i =0; i<graph[curr.v].size(); i++){

                    CreateGraph.Edge edge = graph[curr.v].get(i);
                    pq.add(new Pair(edge.dst,edge.wt));
                }
            }
        }
        System.out.println("final cost is " + finalCost);


    }
}
