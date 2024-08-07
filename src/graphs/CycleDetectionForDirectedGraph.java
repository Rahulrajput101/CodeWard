package graphs;

import java.util.ArrayList;

public class CycleDetectionForDirectedGraph {

    public  boolean mainCycleDetection(ArrayList<CreateGraph.Edge>[] graph){

        boolean[] stack = new boolean[graph.length];
        boolean[] visit = new boolean[graph.length];
        System.out.println(graph.length);
        for (int i=0; i< graph.length; i++){
            System.out.println("i" +i);
            if (!visit[i]){
             if (cycleDetectionUtil(graph,i,visit,stack)){
                 return true;
             }
            }
        }

        return false;

    }

    public static boolean cycleDetectionUtil(ArrayList<CreateGraph.Edge>[] graph, int curr, boolean[] visit, boolean[] stack){
        visit[curr] = true;
        stack[curr] = true;

        for (int i = 0; i<graph[curr].size(); i++){
            CreateGraph.Edge e = graph[curr].get(i);
            if (stack[e.dst]){
                return true;
            }

            if (!visit[e.dst] && cycleDetectionUtil(graph,e.dst,visit,stack)){
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }
}
