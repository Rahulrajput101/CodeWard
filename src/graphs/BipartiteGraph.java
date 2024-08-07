package graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BipartiteGraph {

    public boolean mainBipartiteGraph(ArrayList<CreateGraph.Edge>[] graph) {

        int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            colors[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == -1) {
                colors[i] = 0;
                q.add(i);
               // bipartiteGrahUtil(graph, colors, q);
                if (!bipartiteGrahUtil(graph, colors, q)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean bipartiteGrahUtil(ArrayList<CreateGraph.Edge>[] graph, int[] colors, Queue<Integer> q) {


        while (!q.isEmpty()) {
            int curr = q.remove();

            for (int i = 0; i < graph[curr].size(); i++) {
                CreateGraph.Edge e = graph[curr].get(i);

//                if (colors[e.dst] == -1){
//                    int nextColor = colors[curr] == 0 ? 1: 0;
//                    colors[e.dst] = nextColor;
//                    q.add(e.dst);
//                } else if (Objects.equals(colors[e.dst], colors[curr])) {
//                    return false;
//                }
                if (colors[e.dst] == -1 && colors[curr] == 0) {
                    colors[e.dst] = 1;
                    q.add(e.dst);
                } else if (colors[e.dst] == -1 && colors[curr] == 1) {
                    colors[e.dst] = 0;
                    q.add(e.dst);
                }
                if (Objects.equals(colors[e.dst], colors[curr])) {
                    return false;
                }
            }

        }
        return true;

    }


}
