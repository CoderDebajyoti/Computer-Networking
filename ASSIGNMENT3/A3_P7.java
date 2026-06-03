// Q7: Write a Program to Demonstrate Window Size Variation Effect on Performance.
import java.util.Scanner;

public class A3_P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of frames: ");
        int totalFrames = sc.nextInt();
        
        int[] windowSizes = {1, 4, 8, 16};
        
        System.out.println("\nSimulating performance (cycles needed) for different window sizes:");
        for(int w : windowSizes) {
            int cycles = (int) Math.ceil((double) totalFrames / w);
            System.out.println("Window Size: " + w + " | Cycles needed: " + cycles);
        }
    }
}

/*
Sample Output:
Enter total number of frames: 20

Simulating performance (cycles needed) for different window sizes:
Window Size: 1 | Cycles needed: 20
Window Size: 4 | Cycles needed: 5
Window Size: 8 | Cycles needed: 3
Window Size: 16 | Cycles needed: 2
*/
