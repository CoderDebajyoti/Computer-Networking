// Q2: Write a program to Demonstrate Sender and Receiver Window Mechanism.
import java.util.Scanner;

public class A3_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sender window size: ");
        int sw = sc.nextInt();
        System.out.print("Enter receiver window size: ");
        int rw = sc.nextInt();
        System.out.print("Enter number of frames: ");
        int f = sc.nextInt();

        int s = 0, r = 0;
        while(s < f) {
            int sentInWindow = 0;
            for(int i = 0; i < sw && s < f; i++) {
                System.out.println("Sender: Transmitted Frame " + (s + 1));
                s++;
                sentInWindow++;
            }
            int receivedInWindow = 0;
            for(int i = 0; i < rw && r < s && receivedInWindow < sentInWindow; i++) {
                System.out.println("Receiver: Received and acknowledged Frame " + (r + 1));
                r++;
                receivedInWindow++;
            }
            if(r < s) {
                System.out.println("Receiver window full, some frames dropped or buffered.");
                s = r; // Simple fast-forward for demonstration
            }
        }
    }
}

/*
Sample Output:
Enter sender window size: 4
Enter receiver window size: 3
Enter number of frames: 10
Sender: Transmitted Frame 1
Sender: Transmitted Frame 2
Sender: Transmitted Frame 3
Sender: Transmitted Frame 4
Receiver: Received and acknowledged Frame 1
Receiver: Received and acknowledged Frame 2
Receiver: Received and acknowledged Frame 3
Receiver window full, some frames dropped or buffered.
Sender: Transmitted Frame 4
Sender: Transmitted Frame 5
Sender: Transmitted Frame 6
Sender: Transmitted Frame 7
Receiver: Received and acknowledged Frame 4
Receiver: Received and acknowledged Frame 5
Receiver: Received and acknowledged Frame 6
Receiver window full, some frames dropped or buffered.
Sender: Transmitted Frame 7
Sender: Transmitted Frame 8
Sender: Transmitted Frame 9
Sender: Transmitted Frame 10
Receiver: Received and acknowledged Frame 7
Receiver: Received and acknowledged Frame 8
Receiver: Received and acknowledged Frame 9
Receiver window full, some frames dropped or buffered.
Sender: Transmitted Frame 10
Receiver: Received and acknowledged Frame 10
*/
