// Q5: Write Program to Calculate Throughput of Sliding Window Protocol.
import java.util.Scanner;

public class A3_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter window size (W): ");
        double w = sc.nextDouble();
        System.out.print("Enter Round Trip Time (RTT) in ms: ");
        double rtt = sc.nextDouble();
        System.out.print("Enter Transmission Time (Tt) in ms: ");
        double tt = sc.nextDouble();

        double efficiency = 0;
        if (w * tt >= rtt + tt) {
            efficiency = 1.0;
        } else {
            efficiency = (w * tt) / (rtt + tt);
        }

        System.out.print("Enter bandwidth in Mbps: ");
        double bandwidth = sc.nextDouble();

        double throughput = efficiency * bandwidth;

        System.out.println("Efficiency: " + efficiency);
        System.out.println("Throughput: " + throughput + " Mbps");
    }
}

/*
Sample Output:
Enter window size (W): 4
Enter Round Trip Time (RTT) in ms: 10
Enter Transmission Time (Tt) in ms: 2
Enter bandwidth in Mbps: 100
Efficiency: 0.6666666666666666
Throughput: 66.66666666666666 Mbps
*/
