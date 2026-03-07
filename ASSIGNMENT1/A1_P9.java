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