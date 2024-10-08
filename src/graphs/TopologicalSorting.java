package graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

    public void topologicalMain(ArrayList<CreateGraph.Edge>[] graph){
        boolean[] visit = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for (int i =0; i< graph.length; i++){
            if (!visit[i]){
                topologicalUtil(graph,i,visit,stack);
            }
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void topologicalUtil(ArrayList<CreateGraph.Edge> [] graph , int curr, boolean[] visit, Stack<Integer> stack){
        visit[curr] = true;
        for (int i =0; i<graph[curr].size(); i++){
            CreateGraph.Edge e = graph[curr].get(i);
            if (!visit[e.dst]){
                topologicalUtil(graph,e.dst,visit,stack);
            }
        }
        stack.push(curr);
    }

    //Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        boolean[] visit = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for( int  i =0; i<adj.size(); i++){
            if(!visit[i]){
                topologicalSortUtil(i,adj,visit,stack);
            }
        }
        // int[] array = stack.stream().mapToInt(i -> i).toArray();
        int[] array = new int[stack.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        return array;
    }

    public static void topologicalSortUtil( int curr,ArrayList<ArrayList<Integer>> adj, boolean[] visit, Stack<Integer> stack){

        visit[curr] = true;

        for(int i =0; i<adj.get(curr).size(); i++){
            int nbr = adj.get(curr).get(i);
            if(!visit[nbr]){
                topologicalSortUtil(nbr,adj,visit,stack);
            }
        }
        stack.push(curr);
    }
}
