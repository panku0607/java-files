package Graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Questions2_ {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // motherVortex Question
        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 3));

        // graph[4].add(new Edge(4, 2));

        // graph[5].add(new Edge(5, 2));
        // graph[5].add(new Edge(5, 6));

        // graph[6].add(new Edge(6, 0));
        // graph[6].add(new Edge(6, 4));

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void createUnion_findGraph(ArrayList<Edge> edges) {

        edges.add(new Edge(0, 1));
        // edges.add(new Edge(0, 2));

        edges.add(new Edge(1, 0));
        edges.add(new Edge(1, 2));

        // edges.add(new Edge(2, 0));
        edges.add(new Edge(2, 1));
        edges.add(new Edge(2, 3));

        edges.add(new Edge(3, 2));
        edges.add(new Edge(3, 4));

        edges.add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static int motherVertex(ArrayList<Edge> graph[]) {

        boolean vis[] = new boolean[graph.length];

        int v = -1;

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis);
                v = i;
            }
        }

        boolean check[] = new boolean[graph.length];
        dfs(graph, v, check);
        for (int i = 0; i < graph.length; i++) {
            if (!check[i]) {
                return -1;
            }
        }
        return v;

    }

    static int n = 5;
    public static int par[] = new int[n];
    public static int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static boolean isCycle(ArrayList<Edge> edges) {
            init();

        for (Edge e : edges) {
            int parA = find(e.src);
            int parB = find(e.dest);

            if (parA == parB) {
                return true;
            }
            union(parA, parB);
        }
        return false;
    }

    public static void main(String[] args) {

        // Mother Vortex
        // int V = 5;

        // ArrayList<Edge> graph[] = new ArrayList[V];
        // createGraph(graph);

        // System.out.println(motherVertex(graph)); ;

        // System.out.println(find(3));
        // union(1, 3);
        // System.out.println(find(3));
        // union(2, 4);
        // union(3, 6);
        // System.out.println(find(6));

        // Q no 2 Union- Find Algorithm  // wrong h 
        int V = 5;
        ArrayList<Edge> edges = new ArrayList<>();
        createUnion_findGraph(edges);

        System.out.println(isCycle(edges));

    }

}
