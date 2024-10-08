package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortingUsingBFS {

    public void topSortMain(ArrayList<CreateGraph.Edge>[] graph){
        int[] inDegree = new int[graph.length];
         calcInDegree(graph,inDegree);
        for (int i =0; i<graph.length; i++){

        }
    }
    public static void topSortUtil(ArrayList<CreateGraph.Edge>[] graph, int[] inDegree){
        Queue<Integer> q = new LinkedList<>();
        for (int i =0; i<inDegree.length; i++){
            if (inDegree[i] == 0){
                q.add(i);
            }
        }

        while (!q.isEmpty()){
             int curr = q.remove();
            System.out.println(curr);
             for (int i=0; i<graph[curr].size(); i++){
                 CreateGraph.Edge e = graph[curr].get(i);
                 inDegree[e.dst]--;
                 if (inDegree[e.dst] ==0){
                     q.add(e.dst);
                 }
             }
        }
    }

    private void calcInDegree(ArrayList<CreateGraph.Edge>[] graph, int[] inDegree) {

        for( int i =0; i< graph.length; i++){
            for (int j=0; j<graph[i].size(); j++){
                CreateGraph.Edge e = graph[i].get(j);
                 inDegree[e.dst]++;
            }
        }
    }
}
