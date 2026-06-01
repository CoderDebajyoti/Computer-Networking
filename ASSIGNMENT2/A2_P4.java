package ASSIGNMENT2;

/* Question 4:
   Simulate Packet Loss and Retransmission in Go-Back-N Protocol.
*/

import java.util.Scanner;

public class A2_P4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of frames: ");
        int n = sc.nextInt();

        System.out.print("Enter window size: ");
        int window = sc.nextInt();

        System.out.print("Enter frame number to be lost: ");
        int lost = sc.nextInt();

        int i = 1;

        while (i <= n) {

            for (int j = i; j < i + window && j <= n; j++) {

                System.out.println("Sending Frame: " + j);

                if (j == lost) {
                    System.out.println("Frame " + j + " Lost!");
                    System.out.println("Go-Back-N Retransmitting from Frame " + j);

                    for (int k = j; k < i + window && k <= n; k++) {
                        System.out.println("Resending Frame: " + k);
                        System.out.println("ACK Received for Frame: " + k);
                    }
                    break;
                } else {
                    System.out.println("ACK Received for Frame: " + j);
                }
            }
            i += window;
        }
        sc.close();
    }
}

/* Output:
Enter number of frames: 5
Enter window size: 3
Enter frame number to be lost: 2

Sending Frame: 1
ACK Received for Frame: 1
Sending Frame: 2
Frame 2 Lost!
Go-Back-N Retransmitting from Frame 2
Resending Frame: 2
ACK Received for Frame: 2
Resending Frame: 3
ACK Received for Frame: 3
Sending Frame: 4
ACK Received for Frame: 4
Sending Frame: 5
ACK Received for Frame: 5
*/
