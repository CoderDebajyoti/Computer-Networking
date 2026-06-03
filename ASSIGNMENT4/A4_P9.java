// Q9: Write a program to implement Packet Switching and Circuit Switching.
import java.util.Scanner;

public class A4_P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Circuit Switching");
        System.out.println("2. Packet Switching");
        System.out.print("Choose mode: ");
        int choice = sc.nextInt();
        
        System.out.print("Enter total data size (KB): ");
        int data = sc.nextInt();
        
        if (choice == 1) {
            System.out.println("\n--- Circuit Switching ---");
            System.out.println("Step 1: Establishing dedicated connection...");
            System.out.println("Step 2: Connection established. Transmitting data of " + data + " KB continuously.");
            System.out.println("Step 3: Data transmitted successfully.");
            System.out.println("Step 4: Tearing down connection.");
        } else if (choice == 2) {
            System.out.println("\n--- Packet Switching ---");
            System.out.print("Enter packet size (KB): ");
            int packetSize = sc.nextInt();
            
            int packets = (int) Math.ceil((double) data / packetSize);
            System.out.println("Data divided into " + packets + " packets.");
            
            for (int i = 1; i <= packets; i++) {
                System.out.println("Transmitting packet " + i + " independently via optimal route...");
            }
            System.out.println("All packets received and reassembled at destination.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

/*
Sample Output:
1. Circuit Switching
2. Packet Switching
Choose mode: 2
Enter total data size (KB): 1024

--- Packet Switching ---
Enter packet size (KB): 128
Data divided into 8 packets.
Transmitting packet 1 independently via optimal route...
Transmitting packet 2 independently via optimal route...
Transmitting packet 3 independently via optimal route...
Transmitting packet 4 independently via optimal route...
Transmitting packet 5 independently via optimal route...
Transmitting packet 6 independently via optimal route...
Transmitting packet 7 independently via optimal route...
Transmitting packet 8 independently via optimal route...
All packets received and reassembled at destination.
*/
