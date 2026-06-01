package ASSIGNMENT2;

/* Question 1:
   Implement Sliding Window Flow Control.
*/

public class A2_P1 {
    public static void main(String[] args) {
        int window = 3;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Frame " + i + " Sent");
            if (i % window == 0)
                System.out.println("ACK Received");
        }
    }
}

/* Output:
Frame 1 Sent
Frame 2 Sent
Frame 3 Sent
ACK Received
Frame 4 Sent
Frame 5 Sent
*/
