package ASSIGNMENT6;

import java.util.Random;

/* Question 2:
   Write a program to implement Non-Adaptive Routing Algorithm
   Types - i) Flooding
           ii) Random Walk
*/
public class A6_P2 {
    public static void main(String[] args) {
        System.out.println("=== Non-Adaptive Routing Algorithms Simulation ===");
        
        // 4-node fully connected-ish graph
        int[][] graph = {
            {0, 1, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 0}
        };
        
        int startNode = 0;
        int destNode = 3;
        
        System.out.println("\n--- Flooding ---");
        System.out.println("Node " + startNode + " wants to send a packet to Node " + destNode + ".");
        flooding(startNode, destNode, graph, 0, 2); // max hops = 2
        
        System.out.println("\n--- Random Walk ---");
        System.out.println("Node " + startNode + " wants to send a packet to Node " + destNode + ".");
        randomWalk(startNode, destNode, graph, 10);
    }

    static void flooding(int current, int dest, int[][] graph, int hops, int maxHops) {
        if (hops > maxHops) {
            return;
        }
        System.out.println("Packet arrived at Node " + current + " (Hop " + hops + ")");
        if (current == dest) {
            System.out.println("-> Destination reached via flooding at hop " + hops + "!");
            return;
        }
        for (int i = 0; i < graph.length; i++) {
            if (graph[current][i] == 1) {
                System.out.println("  Node " + current + " floods packet to Node " + i);
                flooding(i, dest, graph, hops + 1, maxHops);
            }
        }
    }
    
    static void randomWalk(int start, int dest, int[][] graph, int maxSteps) {
        Random rand = new Random();
        int current = start;
        System.out.println("Starting Random Walk at Node " + start);
        for (int step = 1; step <= maxSteps; step++) {
            if (current == dest) {
                System.out.println("-> Destination " + dest + " reached in " + (step - 1) + " steps!");
                return;
            }
            int next;
            do {
                next = rand.nextInt(graph.length);
            } while (graph[current][next] == 0); // Find a valid neighbor
            System.out.println("  Step " + step + ": Walked from Node " + current + " to Node " + next);
            current = next;
        }
        System.out.println("Destination not reached within max steps.");
    }
}

/* Output:
=== Non-Adaptive Routing Algorithms Simulation ===

--- Flooding ---
Node 0 wants to send a packet to Node 3.
Packet arrived at Node 0 (Hop 0)
  Node 0 floods packet to Node 1
Packet arrived at Node 1 (Hop 1)
  Node 1 floods packet to Node 0
Packet arrived at Node 0 (Hop 2)
  Node 0 floods packet to Node 1
  Node 0 floods packet to Node 2
  Node 1 floods packet to Node 2
Packet arrived at Node 2 (Hop 2)
  Node 2 floods packet to Node 0
  Node 2 floods packet to Node 1
  Node 2 floods packet to Node 3
  Node 1 floods packet to Node 3
Packet arrived at Node 3 (Hop 2)
-> Destination reached via flooding at hop 2!
  Node 0 floods packet to Node 2
Packet arrived at Node 2 (Hop 1)
  Node 2 floods packet to Node 0
Packet arrived at Node 0 (Hop 2)
  Node 0 floods packet to Node 1
  Node 0 floods packet to Node 2
  Node 2 floods packet to Node 1
Packet arrived at Node 1 (Hop 2)
  Node 1 floods packet to Node 0
  Node 1 floods packet to Node 2
  Node 1 floods packet to Node 3
  Node 2 floods packet to Node 3
Packet arrived at Node 3 (Hop 2)
-> Destination reached via flooding at hop 2!

--- Random Walk ---
Node 0 wants to send a packet to Node 3.
Starting Random Walk at Node 0
  Step 1: Walked from Node 0 to Node 2
  Step 2: Walked from Node 2 to Node 1
  Step 3: Walked from Node 1 to Node 3
-> Destination 3 reached in 3 steps!
*/
