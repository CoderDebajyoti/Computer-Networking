// Q1: Write a program to implement Network Topologies (Bus, Star, Ring, Mesh)
import java.util.Scanner;

public class A4_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Topology: 1. Bus 2. Star 3. Ring 4. Mesh");
        int choice = sc.nextInt();
        System.out.print("Enter number of nodes: ");
        int nodes = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Bus Topology: All " + nodes + " nodes are connected to a single central cable.");
                System.out.println("Number of cables required: 1 (Main cable) + " + nodes + " (drop lines).");
                break;
            case 2:
                System.out.println("Star Topology: All " + nodes + " nodes are connected to a central hub.");
                System.out.println("Number of cables required: " + nodes);
                break;
            case 3:
                System.out.println("Ring Topology: " + nodes + " nodes form a closed loop.");
                System.out.println("Each node is connected to exactly two other nodes.");
                break;
            case 4:
                System.out.println("Mesh Topology: Every node is connected to every other node.");
                int links = (nodes * (nodes - 1)) / 2;
                System.out.println("Number of links required: " + links);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

/*
Sample Output:
Select Topology: 1. Bus 2. Star 3. Ring 4. Mesh
Enter number of nodes: 5
Star Topology: All 5 nodes are connected to a central hub.
Number of cables required: 5
*/
