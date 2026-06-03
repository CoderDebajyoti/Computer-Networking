// Q3: Write a program to Implement Sliding Window Protocol with Error Detection.
import java.util.Scanner;
import java.util.Random;

public class A3_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter window size: ");
        int w = sc.nextInt();
        System.out.print("Enter number of frames to transmit: ");
        int f = sc.nextInt();
        Random rand = new Random();
        
        int sent = 0;
        while(sent < f) {
            int framesToSend = Math.min(w, f - sent);
            for(int i = 0; i < framesToSend; i++) {
                System.out.println("Transmitted Frame " + (sent + i + 1));
            }
            System.out.println("Waiting for acknowledgment...");
            
            boolean error = rand.nextBoolean(); // Randomly simulate error
            if(error) {
                int errorFrame = sent + rand.nextInt(framesToSend) + 1;
                System.out.println("Error detected in Frame " + errorFrame + ". Requesting retransmission.");
            } else {
                System.out.println("Acknowledgment received for frames.");
                sent += framesToSend;
            }
        }
    }
}

/*
Sample Output:
Enter window size: 4
Enter number of frames to transmit: 10
Transmitted Frame 1
Transmitted Frame 2
Transmitted Frame 3
Transmitted Frame 4
Waiting for acknowledgment...
Error detected in Frame 3. Requesting retransmission.
Transmitted Frame 1
Transmitted Frame 2
Transmitted Frame 3
Transmitted Frame 4
Waiting for acknowledgment...
Acknowledgment received for frames.
Transmitted Frame 5
Transmitted Frame 6
Transmitted Frame 7
Transmitted Frame 8
Waiting for acknowledgment...
Error detected in Frame 8. Requesting retransmission.
Transmitted Frame 5
Transmitted Frame 6
Transmitted Frame 7
Transmitted Frame 8
Waiting for acknowledgment...
Acknowledgment received for frames.
Transmitted Frame 9
Transmitted Frame 10
Waiting for acknowledgment...
Acknowledgment received for frames.
*/
