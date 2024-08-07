package graphs;

import java.util.ArrayList;

public class CycleDetection {

    public  boolean cycleDetectionMain(ArrayList<CreateGraph.Edge>[] graph){

        boolean[] visit = new boolean[graph.length];
        for (int i = 0; i< graph.length; i++){
             if(!visit[i] && detectCycleUtil(graph,i,-1,visit)){
                  return true;
             }
        }
        return false;

    }

    private static boolean detectCycleUtil(ArrayList<CreateGraph.Edge>[] graph, int curr, int par, boolean[] visit){
        visit[curr] = true;

        for (int i =0; i<graph[curr].size(); i++){
            CreateGraph.Edge e = graph[curr].get(i);

            //Case 3
            if (!visit[e.dst]){
                if (detectCycleUtil(graph,e.dst,curr,visit)){
                    return true;
                }
            } else if (visit[e.dst] &&  e.dst != par) {   //case 2
                 return true;
            }
            //case 3 no need
        }
        return false;
    }
}
