package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static graphs.CreateGraph.createGraph;

public class CheapestFlightWithInInK {

    public static class Info {
        int vert;
        int cost;
        int stop;

        public Info(int v, int c, int s) {
            this.cost = c;
            this.vert = v;
            this.stop = s;
        }
    }

    public void cheapestFlightsMain(int n, int src, int dst, int k, int flights[][]) {
        ArrayList<CreateGraph.Edge>[] graph = new ArrayList[n];

        createGraph(flights, graph);

        int[] dist = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
            System.out.println("i vallue" + i);
        }

        Queue<Info> queue = new LinkedList<>();

        queue.add(new Info(0, 0, 0));

        while (!queue.isEmpty()) {
            Info info = queue.remove();
            if (info.stop > k) {
                break;
            }

            for (int i = 0; i < graph[info.vert].size(); i++) {
                CreateGraph.Edge e = graph[info.vert].get(i);
                int v = e.dst;
                int wt = e.wt;
                if (info.cost + wt < dist[v]) {
                    dist[v] = info.cost + wt;
                    Info newInfo = new Info(v, dist[v], info.stop + 1);
                    queue.add(newInfo);
                }


            }
        }

        if (dist[dst] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dist[dst]);
        }
    }
}
