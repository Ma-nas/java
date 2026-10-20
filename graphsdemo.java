import java.util.ArrayList;

public class graphsdemo {
   

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // For undirected graph
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list for vertex " + i);
            System.out.print("Head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    static void printgraphimpl(ArrayList<ArrayList<Integer>> adj) {
        printGraph(adj);
    }
    void dfsTraversal(ArrayList<ArrayList<Integer>> adj, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 0; i < adj.get(vertex).size(); i++) {
            int neighbor = adj.get(vertex).get(i);
            if (!visited[neighbor]) {
                dfsTraversal(adj, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printGraph(adj);
        printgraphimpl(adj);
                System.out.println("DFS Traversal starting from vertex 0:");
        boolean[] visited = new boolean[V];
        graphsdemo gd = new graphsdemo();
        gd.dfsTraversal(adj, 0, visited);
        System.out.println();
    }

}

