package ASSIGNMENT6;

import java.util.*;

/* Question 4:
   Write a program to implement OSPF (Open Shortest Path First Protocol).
*/
public class A6_P4 {
    private static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int source) {
        int v = graph.length;
        int[] dist = new int[v];
        boolean[] visited = new boolean[v];

        Arrays.fill(dist, INF);
        dist[source] = 0;

        for (int i = 0; i < v - 1; i++) {
            int u = minDistance(dist, visited);
            if (u == -1) break;
            
            visited[u] = true;

            for (int j = 0; j < v; j++) {
                if (!visited[j] && graph[u][j] != 0 && dist[u] != INF 
                    && dist[u] + graph[u][j] < dist[j]) {
                    dist[j] = dist[u] + graph[u][j];
                }
            }
        }
        printRoutingTable(dist, source);
    }

    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF, minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void printRoutingTable(int[] dist, int source) {
        System.out.println("OSPF Routing Table for Router " + source);
        System.out.println("Destination\tCost");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + "\t\t" + (dist[i] == INF ? "INF" : dist[i]));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Simulating OSPF (Link State Routing using Dijkstra's Algorithm) ===\n");
        
        // Adjacency matrix representation of the network
        int[][] graph = {
            {0, 2, 0, 1, 0, 0},
            {2, 0, 3, 2, 0, 0},
            {0, 3, 0, 0, 1, 5},
            {1, 2, 0, 0, 1, 0},
            {0, 0, 1, 1, 0, 2},
            {0, 0, 5, 0, 2, 0}
        };

        // Each router computes its shortest path tree
        for (int i = 0; i < graph.length; i++) {
            dijkstra(graph, i);
        }
    }
}

/* Output:
=== Simulating OSPF (Link State Routing using Dijkstra's Algorithm) ===

OSPF Routing Table for Router 0
Destination	Cost
0		0
1		2
2		3
3		1
4		2
5		4

OSPF Routing Table for Router 1
Destination	Cost
0		2
1		0
2		3
3		2
4		3
5		5

OSPF Routing Table for Router 2
Destination	Cost
0		3
1		3
2		0
3		2
4		1
5		3

OSPF Routing Table for Router 3
Destination	Cost
0		1
1		2
2		2
3		0
4		1
5		3

OSPF Routing Table for Router 4
Destination	Cost
0		2
1		3
2		1
3		1
4		0
5		2

OSPF Routing Table for Router 5
Destination	Cost
0		4
1		5
2		3
3		3
4		2
5		0
*/
