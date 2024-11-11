package graphs;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class Kruskal {

    static class Edge implements Comparable<Edge>{
        int src;
        int des;
        int wt;

        public Edge(int s , int d, int w){
            this.src = s;
            des = d;
            wt = w;
        }

        @Override
        public int compareTo(@NotNull Edge e2) {
            return this.wt -e2.wt;
        }
    }
    static int n = 4;
    static int [] parent = new int[n];
    static int [] rank = new int[n];

    public static void init(){
        for (int i =0; i<n; i++){
            parent[i] = i;
        }
    }

    public static int find(int x){
        if (parent[x] == x){
            return x;
        }

        //Path compression for optimization
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]){
            parent[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] > rank[parB]) {
            parent[parB] = parA;
        }else {
            parent[parA] = parB;
        }
    }

    public static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,3,50));
    }

    public static void kruskalAlgo(ArrayList<Edge> edges , int V){
        init();
        Collections.sort(edges);
        int count  = 0;
        int mstCost = 0;


        for (int  i = 0; count<V-1; i++){
            Edge e = edges.get(i);
            int parA = find(e.src);  // src
            int parB = find(e.des);  // des
            if (parA != parB){
                union(e.src, e.des);
                count++;
                mstCost += e.wt;
            }
        }

        System.out.println("final cost " + mstCost);
    }

    public static void main(String[] args){
        int V =4;
        ArrayList<Edge> e = new ArrayList<>();
        createGraph(e);
        kruskalAlgo(e,V);
    }

}
