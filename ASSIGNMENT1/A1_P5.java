import java.util.Scanner;

public class A1_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP: ");
        String ip = sc.nextLine();

        String[] p = ip.split("\\.");

        for(String s : p){
            String bin = String.format("%8s", Integer.toBinaryString(Integer.parseInt(s))).replace(' ','0');
            System.out.print(bin + " ");
        }
    }
}