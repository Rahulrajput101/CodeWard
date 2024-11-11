package graphs;

import java.util.ArrayList;

public class CreateGraph {

    public static class Edge {
        int src;
        int dst;
        int wt;

        public Edge(int s, int d, int w) {

            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }


    public static void createGraph(int array[][], ArrayList<Edge>[] graph) {

        for (int  i = 0; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < array.length; i++) {
            int src = array[i][0];
            int dst = array[i][1];
            int wt = array[i][2];
            Edge edge = new Edge(src,dst,wt);
            graph[src].add(edge);
        }

    }

    public static void main(String[] args) {

        //MinimumCostWhenConnectingCities

        int [][] cities = {{0,1,2,3,4},{1,0,5,0,7},{2,5,0,6,0},{3,0,6,0,0},{4,7,0,0,0}};

        ConnectingCities connectingCities = new ConnectingCities();
        connectingCities.connectCitiesMain(cities);


        //Cheapest Flights within in k steps
//        int n = 4;
//
//        int flight[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
//        int src = 0;
//        int dst = 3;
//        int k = 1;
//
//        CheapestFlightWithInInK cheapestFlightWithInInK = new CheapestFlightWithInInK();
//        cheapestFlightWithInInK.cheapestFlightsMain(n,src,dst,k,flight);



//        int v = 6;
//
//        ArrayList<Edge>[] graph = new ArrayList[v];
//         for (int i = 0; i<v; i++){
//             graph[i] = new ArrayList<>();
//         }
//
//
//         //for prim
//        //         //Vertex 0
//        graph[0].add(new Edge(0,1,10));
//        graph[0].add(new Edge(0,3,30));
//        graph[0].add(new Edge(0,2,15));
//
//         //Vertex 1
//        graph[1].add(new Edge(1,0,10));
//        graph[1].add(new Edge(1,3,40));
//
//        //Vertex 2
//        graph[2].add(new Edge(2,0,15));
//        graph[2].add(new Edge(2,3,50));
//
//        //Vertex 3
//        graph[3].add(new Edge(3,1,40));
//        graph[3].add(new Edge(3,2,50));
//
//
//          PrimsAlgoritm primsAlgoritm = new PrimsAlgoritm();
//          primsAlgoritm.primsMain(graph);
//
//         graph[2].add(new Edge(2,3,1));
//
//         graph[3].add(new Edge(3,1,1));
//
//         graph[4].add(new Edge(4,0,1));
//         graph[4].add(new Edge(4,1,1));
//
//         graph[5].add(new Edge(5,0,1));
//         graph[5].add(new Edge(5,2,1));
//
//
//         TopologicalSorting topologicalSorting = new TopologicalSorting();
//         topologicalSorting.topologicalMain(graph);


//         //Vertex 0
//        graph[0].add(new Edge(0,1,5));
//
//         //Vertex 1
//        graph[1].add(new Edge(1,0,5));
//        graph[1].add(new Edge(1,2,1));
//        graph[1].add(new Edge(1,3,3));
//
//        //Vertex 2
//        graph[2].add(new Edge(2,1,1));
//        graph[2].add(new Edge(2,4,2));
//        graph[2].add(new Edge(2,3,1));
//
//        //Vertex 3
//        graph[3].add(new Edge(3,1,1));
//        graph[3].add(new Edge(3,2,1));
//
//        //Vertex 4
//        graph[4].add(new Edge(4,2,2));
//
//        //find the neighbours of 2
//
//        for (int i =0 ; i<graph[2].size(); i++){
//            Edge edge = graph[2].get(i);
//            System.out.println(edge.dst);
//        }

//         graph[0].add(new Edge(0,1,1));
//         graph[0].add(new Edge(0,2,1));
//         graph[0].add(new Edge(0,3,1));
//
//        graph[1].add(new Edge(1,0,1));
//        graph[1].add(new Edge(1,2,1));
//
//        graph[2].add(new Edge(2,1,1));
//        graph[2].add(new Edge(2,0,1));
//        graph[2].add(new Edge(2,4,1));
//
//        graph[3].add(new Edge(3,0,1));
//
//        graph[4].add(new Edge(4,2,1));
//
//        CycleDetection cycleDetection = new CycleDetection();
//        boolean isCycle = cycleDetection.cycleDetectionMain(graph);
//        System.out.println(isCycle);


//         graph[0].add(new Edge(0,1,1));
//         graph[0].add(new Edge(0,2,1));
//
//        graph[1].add(new Edge(1,0,1));
//        graph[1].add(new Edge(1,3,1));
//
//        graph[2].add(new Edge(2,0,1));
//        graph[2].add(new Edge(2,4,1));
//
//        graph[3].add(new Edge(3,1,1));
//        graph[3].add(new Edge(3,4,1));
//
//        graph[4].add(new Edge(4,2,1));
//        graph[4].add(new Edge(4,3,1));


//        BipartiteGraph bipartiteGraph = new BipartiteGraph();
//       boolean isBipartite =  bipartiteGraph.mainBipartiteGraph(graph);
//        System.out.println(isBipartite);

        // Creating a cyclic graph
        // Cyclic Directed Graph
//        graph[0].add(new Edge(0,1,1));
//        graph[0].add(new Edge(0,2,1));
//
//        graph[1].add(new Edge(1,2,1));
//        graph[1].add(new Edge(1,3,1));
//
//        graph[2].add(new Edge(2,0,1));  // This creates a cycle
//        graph[2].add(new Edge(2,4,1));
//
//        graph[3].add(new Edge(3,4,1));
//        graph[3].add(new Edge(3,5,1));
//
//        graph[4].add(new Edge(4,3,1));  // This creates a cycle
//        graph[4].add(new Edge(4,5,1));
//
//        graph[5].add(new Edge(5,1,1));  // T


        // Acyclic Directed Graph
//        graph[0].add(new Edge(0,1,1));
//        graph[0].add(new Edge(0,2,1));
//
//        graph[1].add(new Edge(1,3,1));
//        graph[1].add(new Edge(1,4,1));
//
//        graph[2].add(new Edge(2,3,1));
//        graph[2].add(new Edge(2,5,1));
//
//        graph[3].add(new Edge(3,6,1));
//
//        graph[4].add(new Edge(4,6,1));
//
//        graph[5].add(new Edge(5,6,1));
//
//        CycleDetectionForDirectedGraph cycleDetectionForDirectedGraph = new CycleDetectionForDirectedGraph();
//        boolean isCycle  =cycleDetectionForDirectedGraph.mainCycleDetection(graph);
//        System.out.println(isCycle);


    }
}
