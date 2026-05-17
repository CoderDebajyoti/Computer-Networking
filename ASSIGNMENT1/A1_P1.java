// Q1: Write a Java program to find the local IP address of the machine.
import java.net.InetAddress;

public class A1_P1 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
Sample Output:
IP Address: 192.168.0.102
*/