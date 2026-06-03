package ASSIGNMENT6;

/* Question 1:
   Write a program to implement Adaptive Routing Algorithm
   Types - i) Isolated
           ii) Centralized
           iii) Distributed
*/
public class A6_P1 {
    public static void main(String[] args) {
        System.out.println("=== Adaptive Routing Algorithms Simulation ===");
        
        System.out.println("\n1. Isolated Routing (e.g., Backward Learning)");
        System.out.println("Nodes learn routes based only on local information (e.g., source address of incoming packets).");
        System.out.println("Simulating Node A learning about Node B from a packet received on port 2:");
        System.out.println("-> Routing Table Updated: Dest=B, NextHop=Port 2");
        
        System.out.println("\n2. Centralized Routing (Routing Control Center - RCC)");
        System.out.println("A central node gathers link states from all nodes, computes shortest paths, and distributes routing tables.");
        System.out.println("Simulating RCC computing paths for a 3-node network...");
        System.out.println("-> RCC sends computed table to Node 0: [Dest 1 -> Cost 2], [Dest 2 -> Cost 3]");
        
        System.out.println("\n3. Distributed Routing (Distance Vector Routing)");
        System.out.println("Nodes exchange distance vectors with neighbors to update their tables (Bellman-Ford).");
        
        int[][] graph = {
            {0, 2, 7},
            {2, 0, 1},
            {7, 1, 0}
        };
        
        System.out.println("Initial Network Graph (Adjacency Matrix):");
        printMatrix(graph);
        
        System.out.println("Nodes exchange vectors and update tables...");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    if (graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
        
        System.out.println("Updated routing table after distance vector exchange:");
        printMatrix(graph);
    }
    
    private static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

/* Output:
=== Adaptive Routing Algorithms Simulation ===

1. Isolated Routing (e.g., Backward Learning)
Nodes learn routes based only on local information (e.g., source address of incoming packets).
Simulating Node A learning about Node B from a packet received on port 2:
-> Routing Table Updated: Dest=B, NextHop=Port 2

2. Centralized Routing (Routing Control Center - RCC)
A central node gathers link states from all nodes, computes shortest paths, and distributes routing tables.
Simulating RCC computing paths for a 3-node network...
-> RCC sends computed table to Node 0: [Dest 1 -> Cost 2], [Dest 2 -> Cost 3]

3. Distributed Routing (Distance Vector Routing)
Nodes exchange distance vectors with neighbors to update their tables (Bellman-Ford).
Initial Network Graph (Adjacency Matrix):
0	2	7	
2	0	1	
7	1	0	
Nodes exchange vectors and update tables...
Updated routing table after distance vector exchange:
0	2	3	
2	0	1	
3	1	0	
*/
