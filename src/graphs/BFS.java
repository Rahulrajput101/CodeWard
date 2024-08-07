package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BFS {
    public static void main(String[] args){
        int v = 7;
        ArrayList<CreateGraph.Edge>[] graph = new ArrayList[v];
        for (int i =0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new CreateGraph.Edge(0,1,1));
        graph[0].add(new CreateGraph.Edge(0,2,1));

        graph[1].add(new CreateGraph.Edge(1,0,1));
        graph[1].add(new CreateGraph.Edge(1,3,1));

        graph[2].add(new CreateGraph.Edge(2,0,1));
        graph[2].add(new CreateGraph.Edge(2,4,1));

        graph[3].add(new CreateGraph.Edge(3,1,1));
        graph[3].add(new CreateGraph.Edge(3,4,1));
        graph[3].add(new CreateGraph.Edge(3,5,1));

        graph[4].add(new CreateGraph.Edge(4,2,1));
        graph[4].add(new CreateGraph.Edge(4,5,1));

        graph[5].add(new CreateGraph.Edge(5,3,1));
        graph[5].add(new CreateGraph.Edge(5,4,1));
        graph[5].add(new CreateGraph.Edge(5,6,1));

        graph[6].add(new CreateGraph.Edge(6,5,1));

       // bfs(graph);
        boolean[] visit = new boolean[graph.length];
        HasPath hasPath = new HasPath();
        hasPath.hasPathMain(graph,visit);
       // dfs(graph,0,visit);

    }
    public static void bfs(ArrayList<CreateGraph.Edge>[] graph){
        boolean[] visit = new boolean[graph.length];
        for (int i =0; i< graph.length; i++){
            if (!visit[i]){
                bfsUtil(graph,visit);
            }
        }
    }

    public static void bfsUtil(ArrayList<CreateGraph.Edge>[] graph, boolean[] visit){ //0(V+E)
        Queue<Integer> q = new LinkedList<>();

        q.add(graph[0].get(0).src);

        while (!q.isEmpty()){
            int curr = q.remove();
            if (!visit[curr]){
                System.out.println(curr);
                visit[curr] = true;
                for (int i =0; i<graph[curr].size(); i++){
                     q.add(graph[curr].get(i).dst);
                }
            }
        }
    }
    public static void dfs(ArrayList<CreateGraph.Edge>[] graph){
        boolean[] visit = new boolean[graph.length];
        for (int i =0; i< graph.length; i++){
            if (!visit[i]){
               dfsUtil(graph,i,visit);
            }
        }
    }


    public static void dfsUtil(ArrayList<CreateGraph.Edge>[] graph , int curr,boolean [] visit){

        System.out.println(curr);
        visit[curr] = true;

        for (int i =0; i<graph[curr].size(); i++){
            CreateGraph.Edge e = graph[curr].get(i);
            if (!visit[e.dst]){
                dfsUtil(graph,e.dst,visit);
            }
        }
    }

}
