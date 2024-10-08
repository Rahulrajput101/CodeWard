package graphs;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

    public void shortestPathMain(ArrayList<CreateGraph.Edge>[] graph){

        int src = 0;

        dijkstra(graph,src);
    }

    static class Pair implements Comparable<Pair>{
         int n;  //node value
         int path;  //shortest distance

         public Pair(int n, int path){
             this.n = n;
             this.path = path;
         }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }
    public static void dijkstra(ArrayList<CreateGraph.Edge>[] graph , int src){
        int dist[] = new int[graph.length];
         boolean visit [] = new boolean [graph.length];
        for (int i =0; i< graph.length; i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }

        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if (!visit[curr.n]){
                visit[curr.n] = true;
               //neighbours
                for (int i =0; i<graph[curr.n].size(); i++){
                    CreateGraph.Edge e =graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dst;
                    int wt = e.wt;

                    if (dist[u] + wt < dist[v]){ //Update distance of src to v
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair( v,dist[v]));
                    }

                }

            }
        }

        for (int i =0; i< dist.length; i++){
            System.out.println(dist[i]);
        }
     }
}
