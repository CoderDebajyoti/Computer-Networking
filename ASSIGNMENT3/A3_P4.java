// Q4: Write a program to Simulate Packet Loss and Retransmission in Go-Back-N.
import java.util.Scanner;
import java.util.Random;

public class A3_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter window size: ");
        int w = sc.nextInt();
        System.out.print("Enter total number of frames: ");
        int f = sc.nextInt();
        Random rand = new Random();
        
        int nextSeqNum = 1;
        while (nextSeqNum <= f) {
            int maxSend = Math.min(w, f - nextSeqNum + 1);
            System.out.println("\n--- New Window ---");
            for (int i = 0; i < maxSend; i++) {
                System.out.println("Sending frame: " + (nextSeqNum + i));
            }
            
            int ackIdx = 0;
            boolean loss = false;
            for (int i = 0; i < maxSend; i++) {
                if (rand.nextInt(4) == 0) { // 25% chance of packet loss
                    System.out.println("Frame " + (nextSeqNum + i) + " lost!");
                    loss = true;
                    break;
                } else {
                    System.out.println("ACK received for frame: " + (nextSeqNum + i));
                    ackIdx++;
                }
            }
            nextSeqNum += ackIdx;
            if (loss) {
                System.out.println("Retransmitting window starting from frame: " + nextSeqNum);
            }
        }
        System.out.println("\nAll frames transmitted successfully.");
    }
}

/*
Sample Output:
Enter window size: 4
Enter total number of frames: 10

--- New Window ---
Sending frame: 1
Sending frame: 2
Sending frame: 3
Sending frame: 4
ACK received for frame: 1
ACK received for frame: 2
ACK received for frame: 3
ACK received for frame: 4

--- New Window ---
Sending frame: 5
Sending frame: 6
Sending frame: 7
Sending frame: 8
ACK received for frame: 5
ACK received for frame: 6
ACK received for frame: 7
ACK received for frame: 8

--- New Window ---
Sending frame: 9
Sending frame: 10
ACK received for frame: 9
ACK received for frame: 10

All frames transmitted successfully.
*/
