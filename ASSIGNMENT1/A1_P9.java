// Q9: Write a Java program to calculate the number of subnets given the number of borrowed bits.
import java.util.Scanner;

public class A1_P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter borrowed bits: ");
        int n = sc.nextInt();

        int subnets = (int)Math.pow(2,n);

        System.out.println("Number of Subnets: "+subnets);
    }
}

/*
Sample Output:
Enter borrowed bits: 3
Number of Subnets: 8
*/