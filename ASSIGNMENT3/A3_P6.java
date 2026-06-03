// Q6: Write a Program to Implement Bidirectional Sliding Window Communication.
import java.util.Scanner;

public class A3_P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter window size: ");
        int w = sc.nextInt();
        System.out.print("Enter number of frames A wants to send to B: ");
        int fa = sc.nextInt();
        System.out.print("Enter number of frames B wants to send to A: ");
        int fb = sc.nextInt();

        int sentA = 0, sentB = 0;
        while(sentA < fa || sentB < fb) {
            System.out.println("\n--- New Window Cycle ---");
            // A sends to B
            int sendingA = Math.min(w, fa - sentA);
            if(sendingA > 0) {
                System.out.println("A sending " + sendingA + " frames to B.");
                sentA += sendingA;
                System.out.println("B received frames from A and sends ACK.");
            }
            
            // B sends to A (Piggybacking or independent)
            int sendingB = Math.min(w, fb - sentB);
            if(sendingB > 0) {
                System.out.println("B sending " + sendingB + " frames to A (Piggybacking ACK if possible).");
                sentB += sendingB;
                System.out.println("A received frames from B and sends ACK.");
            }
        }
        System.out.println("\nCommunication complete.");
    }
}

/*
Sample Output:
Enter window size: 4
Enter number of frames A wants to send to B: 6
Enter number of frames B wants to send to A: 8

--- New Window Cycle ---
A sending 4 frames to B.
B received frames from A and sends ACK.
B sending 4 frames to A (Piggybacking ACK if possible).
A received frames from B and sends ACK.

--- New Window Cycle ---
A sending 2 frames to B.
B received frames from A and sends ACK.
B sending 4 frames to A (Piggybacking ACK if possible).
A received frames from B and sends ACK.

Communication complete.
*/
