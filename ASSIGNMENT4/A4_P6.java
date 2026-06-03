// Q6: Write a program to implement ARP Protocol.
import java.util.Scanner;
import java.util.HashMap;

public class A4_P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> arpTable = new HashMap<>();
        
        arpTable.put("192.168.1.1", "00:1A:2B:3C:4D:5E");
        arpTable.put("192.168.1.2", "00:1A:2B:3C:4D:5F");
        arpTable.put("192.168.1.3", "00:1A:2B:3C:4D:60");
        
        System.out.println("Current ARP Table:");
        for (String ip : arpTable.keySet()) {
            System.out.println("IP: " + ip + " -> MAC: " + arpTable.get(ip));
        }
        
        System.out.print("\nEnter IP address to find MAC address: ");
        String ip = sc.next();
        
        if (arpTable.containsKey(ip)) {
            System.out.println("ARP Reply: MAC Address for " + ip + " is " + arpTable.get(ip));
        } else {
            System.out.println("ARP Request broadcasted. Target host unreachable or not in network.");
        }
    }
}

/*
Sample Output:
Current ARP Table:
IP: 192.168.1.1 -> MAC: 00:1A:2B:3C:4D:5E
IP: 192.168.1.3 -> MAC: 00:1A:2B:3C:4D:60
IP: 192.168.1.2 -> MAC: 00:1A:2B:3C:4D:5F

Enter IP address to find MAC address: 192.168.1.2
ARP Reply: MAC Address for 192.168.1.2 is 00:1A:2B:3C:4D:5F
*/
