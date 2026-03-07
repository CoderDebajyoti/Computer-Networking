import java.util.Scanner;

public class A1_P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP: ");
        String ip = sc.nextLine();

        System.out.print("Enter Subnet Mask: ");
        String mask = sc.nextLine();

        String[] ipParts = ip.split("\\.");
        String[] maskParts = mask.split("\\.");

        int[] network = new int[4];
        int[] broadcast = new int[4];

        for(int i=0;i<4;i++){
            int ipNum = Integer.parseInt(ipParts[i]);
            int maskNum = Integer.parseInt(maskParts[i]);

            network[i] = ipNum & maskNum;
            broadcast[i] = network[i] | (255-maskNum);
        }

        System.out.print("Network ID: ");
        for(int i=0;i<4;i++)
            System.out.print(network[i]+(i<3?".":""));

        System.out.print("\nBroadcast: ");
        for(int i=0;i<4;i++)
            System.out.print(broadcast[i]+(i<3?".":""));
    }
}