package ASSIGNMENT2;

/* Question 5:
   Calculate Throughput of Sliding Window Protocol.
*/

import java.util.Scanner;

public class A2_P5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Window Size: ");
        int windowSize = sc.nextInt();

        System.out.print("Enter Transmission Time: ");
        int transmissionTime = sc.nextInt();

        double throughput =
                (double) windowSize / (1 + transmissionTime);

        System.out.println("Throughput = " + throughput);

        sc.close();
    }
}

/* Output:
Enter Window Size: 4
Enter Transmission Time: 2
Throughput = 1.3333333333333333
*/
