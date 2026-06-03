// Q7: Write a program to implement DNS Lookup.
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class A4_P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. URL to IP");
        System.out.println("2. IP to URL");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        try {
            if (choice == 1) {
                System.out.print("Enter URL: ");
                String url = sc.next();
                InetAddress address = InetAddress.getByName(url);
                System.out.println("IP Address: " + address.getHostAddress());
            } else if (choice == 2) {
                System.out.print("Enter IP Address: ");
                String ip = sc.next();
                InetAddress address = InetAddress.getByName(ip);
                System.out.println("Host Name: " + address.getHostName());
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve host: " + e.getMessage());
        }
    }
}

/*
Sample Output:
1. URL to IP
2. IP to URL
Enter choice: 1
Enter URL: google.com
IP Address: 142.250.193.110
*/
