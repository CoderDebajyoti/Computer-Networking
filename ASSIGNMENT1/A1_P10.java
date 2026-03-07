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