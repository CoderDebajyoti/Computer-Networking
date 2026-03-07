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