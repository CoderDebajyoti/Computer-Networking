// Q4: Write a Java program to check if a given IP address is a Public or Private IP address.
 import java.util.Scanner;

public class A1_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String ip = sc.nextLine();

        String[] p = ip.split("\\.");
        int a=Integer.parseInt(p[0]);
        int b=Integer.parseInt(p[1]);

        if(a==10 || (a==172 && b>=16 && b<=31) || (a==192 && b==168))
            System.out.println("Private IP");
        else
            System.out.println("Public IP");
    }
}

/*
Sample Output:
Enter IP Address: 192.168.1.1
Private IP
*/