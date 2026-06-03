// Q1: Write a program to Simulate Sliding Window Flow Control.
import java.util.Scanner;

public class A3_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter window size: ");
        int w = sc.nextInt();
        System.out.print("Enter number of frames to transmit: ");
        int f = sc.nextInt();
        
        System.out.println("Transmitting frames...");
        int sent = 0;
        while(sent < f) {
            for(int i = 0; i < w && sent < f; i++) {
                System.out.println("Transmitted Frame " + (sent + 1));
                sent++;
            }
            System.out.println("Waiting for acknowledgment...");
            System.out.println("Acknowledgment received for the window.");
        }
    }
}

/*
Sample Output:
Enter window size: 4
Enter number of frames to transmit: 10
Transmitting frames...
Transmitted Frame 1
Transmitted Frame 2
Transmitted Frame 3
Transmitted Frame 4
Waiting for acknowledgment...
Acknowledgment received for the window.
Transmitted Frame 5
Transmitted Frame 6
Transmitted Frame 7
Transmitted Frame 8
Waiting for acknowledgment...
Acknowledgment received for the window.
Transmitted Frame 9
Transmitted Frame 10
Waiting for acknowledgment...
Acknowledgment received for the window.
*/
