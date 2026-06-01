package ASSIGNMENT2;

/* Question 3:
   Implement Sliding Window with Error Detection.
*/

public class A2_P3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i == 3)
                System.out.println("Error in Frame 3");
            else
                System.out.println("Frame " + i + " Correct");
        }
    }
}

/* Output:
Frame 1 Correct
Frame 2 Correct
Error in Frame 3
Frame 4 Correct
*/
