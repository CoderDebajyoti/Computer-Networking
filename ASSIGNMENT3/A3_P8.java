// Q8: Write a Program for Graphical Simulation of Sliding Window Protocol.
import java.util.Scanner;

public class A3_P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter window size: ");
        int w = sc.nextInt();
        System.out.print("Enter total frames: ");
        int total = sc.nextInt();
        
        int start = 1;
        while(start <= total) {
            int end = Math.min(start + w - 1, total);
            System.out.print("Frames: [");
            for(int i = 1; i <= total; i++) {
                if(i >= start && i <= end) {
                    System.out.print(" *" + i + "* ");
                } else {
                    System.out.print("  " + i + "  ");
                }
            }
            System.out.println("]");
            System.out.println("Transmitting window [" + start + " to " + end + "]...");
            System.out.println("ACK received. Sliding window...\n");
            start += w;
        }
    }
}

/*
Sample Output:
Enter window size: 4
Enter total frames: 10
Frames: [ *1*  *2*  *3*  *4*   5    6    7    8    9    10  ]
Transmitting window [1 to 4]...
ACK received. Sliding window...

Frames: [  1    2    3    4   *5*  *6*  *7*  *8*   9    10  ]
Transmitting window [5 to 8]...
ACK received. Sliding window...

Frames: [  1    2    3    4    5    6    7    8   *9*  *10* ]
Transmitting window [9 to 10]...
ACK received. Sliding window...
*/
