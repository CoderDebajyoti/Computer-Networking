// Q2: Write a Java program to check if a given IP address is an IPv4 or IPv6 address.
import java.util.Scanner;

public class A1_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String ip = sc.nextLine();

        if(ip.contains("."))
            System.out.println("IPv4 Address");
        else if(ip.contains(":"))
            System.out.println("IPv6 Address");
        else
            System.out.println("Invalid IP Address");
    }
}

/*
Sample Output:
Enter IP Address: 192.168.1.1
IPv4 Address
*/