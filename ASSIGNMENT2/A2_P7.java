package ASSIGNMENT2;

/* Question 7:
   Analyze the Effect of Window Size Variation.
*/

import java.util.Scanner;

public class A2_P7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total frames: ");
        int frames = sc.nextInt();

        System.out.print("Enter window size: ");
        int window = sc.nextInt();

        int transmissions =
                (int)Math.ceil((double)frames / window);

        System.out.println("Total Frames = " + frames);
        System.out.println("Window Size = " + window);
        System.out.println("Number of Transmissions = " + transmissions);

        if (window > 3)
            System.out.println("Performance Improved");
        else
            System.out.println("Performance Low");

        sc.close();
    }
}

/* Output:
Enter total frames: 10
Enter window size: 4

Total Frames = 10
Window Size = 4
Number of Transmissions = 3
Performance Improved
*/
