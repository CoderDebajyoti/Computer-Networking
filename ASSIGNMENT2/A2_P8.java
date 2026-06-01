package ASSIGNMENT2;

/* Question 8:
   Graphical Simulation of Sliding Window Protocol.
*/

import java.util.Scanner;

public class A2_P8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of frames: ");
        int n = sc.nextInt();

        System.out.print("Enter window size: ");
        int w = sc.nextInt();

        for (int i = 1; i <= n; i += w) {

            System.out.print("Window: ");

            for (int j = i; j < i + w && j <= n; j++) {
                System.out.print("[F" + j + "] ");
            }

            System.out.println("-> Sent");
            System.out.println("ACK Received\n");
        }

        sc.close();
    }
}

/* Output:
Enter total number of frames: 8
Enter window size: 3

Window: [F1] [F2] [F3] -> Sent
ACK Received

Window: [F4] [F5] [F6] -> Sent
ACK Received

Window: [F7] [F8] -> Sent
ACK Received
*/
