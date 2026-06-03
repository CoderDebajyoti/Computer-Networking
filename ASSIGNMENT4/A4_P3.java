// Q3: Write a program to implement Hamming Code in Computer Networking.
import java.util.Scanner;

public class A4_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-bit data word: ");
        String data = sc.next();
        
        if (data.length() != 4) {
            System.out.println("Please enter exactly 4 bits.");
            return;
        }
        
        int[] d = new int[4];
        for (int i = 0; i < 4; i++) {
            d[i] = data.charAt(i) - '0';
        }
        
        int p1 = d[0] ^ d[1] ^ d[3];
        int p2 = d[0] ^ d[2] ^ d[3];
        int p4 = d[1] ^ d[2] ^ d[3];
        
        // P1 P2 D1 P4 D2 D3 D4 (7-bit Hamming Code for 4-bit data)
        // positions: 1 2 3 4 5 6 7
        System.out.print("Generated Hamming Code (Even Parity): ");
        System.out.println("" + p1 + p2 + d[0] + p4 + d[1] + d[2] + d[3]);
    }
}

/*
Sample Output:
Enter 4-bit data word: 1011
Generated Hamming Code (Even Parity): 0110011
*/
