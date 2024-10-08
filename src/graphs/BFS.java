package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BFS {
    public static void main(String[] args){
        int v = 6;
        ArrayList<CreateGraph.Edge>[] graph = new ArrayList[v];
        for (int i =0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new CreateGraph.Edge(0,1,2));
        graph[0].add(new CreateGraph.Edge(0,2,4));

        graph[1].add(new CreateGraph.Edge(1,2,1));
        graph[1].add(new CreateGraph.Edge(1,3,7));

        graph[2].add(new CreateGraph.Edge(2,4,3));

        graph[3].add(new CreateGraph.Edge(3,5,1));

        graph[4].add(new CreateGraph.Edge(4,3,2));
        graph[4].add(new CreateGraph.Edge(4,5,5));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.shortestPathMain(graph);

//        graph[0].add(new CreateGraph.Edge(0,3,1));
//        graph[2].add(new CreateGraph.Edge(2,3,1));
//
//        graph[3].add(new CreateGraph.Edge(3,1,1));
//
//        graph[4].add(new CreateGraph.Edge(4,0,1));
//        graph[4].add(new CreateGraph.Edge(4,1,1));
//
//        graph[5].add(new CreateGraph.Edge(5,0,1));
//        graph[5].add(new CreateGraph.Edge(5,2,1));
//
//        AllPathsFromSourceToTarget allPathsFromSourceToTarget = new AllPathsFromSourceToTarget();
//        allPathsFromSourceToTarget.printAllPath(graph,5,"",1);

//        graph[0].add(new CreateGraph.Edge(0,1,1));
//        graph[0].add(new CreateGraph.Edge(0,2,1));
//
//        graph[1].add(new CreateGraph.Edge(1,0,1));
//        graph[1].add(new CreateGraph.Edge(1,3,1));
//
//        graph[2].add(new CreateGraph.Edge(2,0,1));
//        graph[2].add(new CreateGraph.Edge(2,4,1));
//
//        graph[3].add(new CreateGraph.Edge(3,1,1));
//        graph[3].add(new CreateGraph.Edge(3,4,1));
//        graph[3].add(new CreateGraph.Edge(3,5,1));
//
//        graph[4].add(new CreateGraph.Edge(4,2,1));
//        graph[4].add(new CreateGraph.Edge(4,5,1));
//
//        graph[5].add(new CreateGraph.Edge(5,3,1));
//        graph[5].add(new CreateGraph.Edge(5,4,1));
//        graph[5].add(new CreateGraph.Edge(5,6,1));
//
//        graph[6].add(new CreateGraph.Edge(6,5,1));
        // Create an adjacency list
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertices);
//
//        // Initialize each list in the graph
//        for (int i = 0; i < vertices; i++) {
//            graph.add(new ArrayList<>());
//        }

//        graph.get(0).add(1); // 0 -> 1
//        graph.get(0).add(2); // 0 -> 2
//
//        graph.get(1).add(3); // 1 -> 3
//        graph.get(1).add(4); // 1 -> 4
//
//        graph.get(2).add(3); // 2 -> 3
//        graph.get(2).add(5); // 2 -> 5
//
//        graph.get(3).add(6); // 3 -> 6
//
//        graph.get(4).add(6); // 4 -> 6
//
//        graph.get(5).add(6); // 5 -> 6


        // bfs(graph);
//        boolean[] visit = new boolean[graph.length];
//        HasPath hasPath = new HasPath();
//        hasPath.hasPathMain(graph,visit);
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
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfsResult = new ArrayList<>();
        boolean [] visit = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while(!queue.isEmpty()){
            int curr = queue.remove();
            if (!visit[curr]){
                visit[curr] = true;
                bfsResult.add(curr);
                for (int i =0; i<adj.get(curr).size(); i++){
                     queue.add(adj.get(curr).get(i));
                }
            }
        }

        return bfsResult;
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        ArrayList<Integer> bfsResult = new ArrayList<>();
        boolean [] visit = new boolean[V];

        dfsUtil(adj,visit,bfsResult,0);
        return bfsResult;
    }

    public void dfsUtil(ArrayList<ArrayList<Integer>> adj,boolean [] visit,ArrayList<Integer> bfsResult, int v){

        bfsResult.add(v);
        visit[v] = true;

        for(int i =0 ; i<adj.get(v).size(); i++){
            int nbr = adj.get(v).get(i);
            if(!visit[nbr]){
                dfsUtil(adj,visit,bfsResult,nbr);
            }

        }
    }
}
