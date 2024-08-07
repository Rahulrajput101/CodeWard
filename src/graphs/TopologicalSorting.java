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
}
