// Q6: Write a Java program to convert a given binary IP address to decimal format.
import java.util.Scanner;

public class A1_P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 binary octets:");
        for(int i=0;i<4;i++){
            String bin = sc.next();
            int dec = Integer.parseInt(bin,2);
            System.out.print(dec);
            if(i<3) System.out.print(".");
        }
    }
}

/*
Sample Output:
Enter 4 binary octets:
11000000 10101000 00000001 00000001
192.168.1.1
*/