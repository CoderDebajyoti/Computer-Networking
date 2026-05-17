// Q10: Write a Java program to calculate the number of usable hosts per subnet given the number of host bits.
import java.util.Scanner;

public class A1_P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter host bits: ");
        int n = sc.nextInt();

        int hosts = (int)Math.pow(2,n)-2;

        System.out.println("Hosts per Subnet: "+hosts);
    }
}

/*
Sample Output:
Enter host bits: 5
Hosts per Subnet: 30
*/