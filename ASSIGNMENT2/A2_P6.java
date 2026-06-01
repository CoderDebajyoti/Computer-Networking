package ASSIGNMENT2;

/* Question 6:
   Implement Bidirectional Sliding Window Communication.
*/

import java.util.Scanner;

public class A2_P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of frames: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("A sends Frame " + i + " to B");
            System.out.println("B received Frame " + i);
            System.out.println("B sends ACK " + i);

            System.out.println("B sends Frame " + i + " to A");
            System.out.println("A received Frame " + i);
            System.out.println("A sends ACK " + i);

            System.out.println();
        }

        sc.close();
    }
}

/* Output:
Enter number of frames: 2

A sends Frame 1 to B
B received Frame 1
B sends ACK 1
B sends Frame 1 to A
A received Frame 1
A sends ACK 1

A sends Frame 2 to B
B received Frame 2
B sends ACK 2
B sends Frame 2 to A
A received Frame 2
A sends ACK 2
*/
