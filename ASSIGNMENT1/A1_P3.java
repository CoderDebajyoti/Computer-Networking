// Q3: Write a Java program to determine the class (A, B, C, D, or E) of a given IPv4 address.
import java.util.Scanner;

public class A1_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IPv4 Address: ");
        String ip = sc.nextLine();

        int first = Integer.parseInt(ip.split("\\.")[0]);

        if(first>=1 && first<=126)
            System.out.println("Class A");
        else if(first<=191)
            System.out.println("Class B");
        else if(first<=223)
            System.out.println("Class C");
        else if(first<=239)
            System.out.println("Class D");
        else
            System.out.println("Class E");
    }
}

/*
Sample Output:
Enter IPv4 Address: 192.168.1.1
Class C
*/