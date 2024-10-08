package graphs;

import java.util.ArrayList;

public class AllPathsFromSourceToTarget {


    public void printAllPath(ArrayList<CreateGraph.Edge>[] graph,int src, String path,int dest){
         if (src == dest){
             System.out.println(path+dest);
             return;
         }

         for (int  i=0; i<graph[src].size(); i++){
              CreateGraph.Edge edge = graph[src].get(i);
            // System.out.print(edge.src+" "+edge.dst);
              printAllPath(graph,edge.dst,path+edge.src,dest);

         }

    }
}
