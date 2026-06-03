// Q8: Write a program to implement DHCP Protocol.
import java.util.Scanner;
import java.util.ArrayList;

public class A4_P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pool = new ArrayList<>();
        pool.add("192.168.1.100");
        pool.add("192.168.1.101");
        pool.add("192.168.1.102");
        
        System.out.println("DHCP Server Initialized with " + pool.size() + " addresses in pool.");
        
        while (true) {
            System.out.println("\n1. Request IP Address (DHCP Discover)");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                if (pool.isEmpty()) {
                    System.out.println("DHCP Server Error: No more IP addresses available in pool.");
                } else {
                    String assignedIp = pool.remove(0);
                    System.out.println("DHCP Offer -> DHCP Request -> DHCP ACK");
                    System.out.println("Assigned IP Address: " + assignedIp);
                }
            } else {
                break;
            }
        }
    }
}

/*
Sample Output:
DHCP Server Initialized with 3 addresses in pool.

1. Request IP Address (DHCP Discover)
2. Exit
Choice: 1
DHCP Offer -> DHCP Request -> DHCP ACK
Assigned IP Address: 192.168.1.100

1. Request IP Address (DHCP Discover)
2. Exit
Choice: 2
*/
