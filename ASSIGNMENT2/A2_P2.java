package ASSIGNMENT2;

/* Question 2:
   Implement Sender and Receiver Window Mechanism.
*/

public class A2_P2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Sender: Frame " + i);
            System.out.println("Receiver: ACK " + i);
        }
    }
}

/* Output:
Sender: Frame 1
Receiver: ACK 1
Sender: Frame 2
Receiver: ACK 2
Sender: Frame 3
Receiver: ACK 3
*/
