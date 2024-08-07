package graphs;

import java.util.ArrayList;

public  class HasPath {
    public void hasPathMain(ArrayList<CreateGraph.Edge>[] graph,boolean[] visit){

        System.out.println(hasPath(graph,0, 6,visit));
    }

    public static boolean hasPath(ArrayList<CreateGraph.Edge>[] graph, int src, int destination, boolean[] visit){
        if (src == destination){
            return true;
        }
        visit[src] = true;

        for (int i =0; i<graph[src].size(); i++){
            CreateGraph.Edge e = graph[src].get(i);
            if (!visit[e.dst]  && hasPath(graph, e.dst, destination, visit)){
                return true;
            }
        }
        return false;


    }
}
