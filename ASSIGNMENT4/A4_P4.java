// Q4: Write a program to implement Distance Vector Routing Algorithm
import java.util.Scanner;

public class A4_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        int[][] cost = new int[n][n];
        System.out.println("Enter cost matrix (use 999 for infinity):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = cost[i][j];
            }
        }
        
        // Bellman-Ford
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
        System.out.println("\nFinal Routing Tables (Shortest Distances):");
        for (int i = 0; i < n; i++) {
            System.out.println("From node " + i + ":");
            for (int j = 0; j < n; j++) {
                System.out.println("To node " + j + " -> Cost: " + dist[i][j]);
            }
            System.out.println();
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

Final Routing Tables (Shortest Distances):
From node 0:
To node 0 -> Cost: 0
To node 1 -> Cost: 2
To node 2 -> Cost: 3

From node 1:
To node 0 -> Cost: 2
To node 1 -> Cost: 0
To node 2 -> Cost: 1

From node 2:
To node 0 -> Cost: 3
To node 1 -> Cost: 1
To node 2 -> Cost: 0
*/
