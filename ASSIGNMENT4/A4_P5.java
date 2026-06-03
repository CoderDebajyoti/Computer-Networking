// Q5: Write a program to implement Link State Routing Algorithm
import java.util.Scanner;

public class A4_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        System.out.println("Enter cost matrix (use 999 for infinity):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter source node (0 to " + (n - 1) + "): ");
        int src = sc.nextInt();
        
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            dist[i] = 999;
            visited[i] = false;
        }
        dist[src] = 0;
        
        for (int count = 0; count < n - 1; count++) {
            int u = -1, min = 999;
            for (int i = 0; i < n; i++) {
                if (!visited[i] && dist[i] < min) {
                    min = dist[i];
                    u = i;
                }
            }
            
            if (u == -1) break;
            visited[u] = true;
            
            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 999 && dist[u] != 999 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        
        System.out.println("\nShortest path from node " + src + " to all other nodes:");
        for (int i = 0; i < n; i++) {
            System.out.println("To node " + i + " -> Cost: " + dist[i]);
        }
    }
}

/*
Sample Output:
Enter number of nodes: 3
Enter cost matrix (use 999 for infinity):
0 2 3
2 0 1
3 1 0
Enter source node (0 to 2): 0
Shortest path from node 0 to all other nodes:
To node 0 -> Cost: 0
To node 1 -> Cost: 2
To node 2 -> Cost: 3
*/
