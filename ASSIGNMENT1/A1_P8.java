// Q8: Write a Java program to find the Subnet Mask given the prefix length (CIDR notation).
import java.util.Scanner;

public class A1_P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter prefix length: ");
        int n = sc.nextInt();

        int mask = 0xffffffff << (32-n);

        int a=(mask>>>24)&255;
        int b=(mask>>>16)&255;
        int c=(mask>>>8)&255;
        int d=mask&255;

        System.out.println("Subnet Mask: "+a+"."+b+"."+c+"."+d);
    }
}

/*
Sample Output:
Enter prefix length: 24
Subnet Mask: 255.255.255.0
*/