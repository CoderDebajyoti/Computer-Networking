package ASSIGNMENT6;

import java.util.*;

/* Question 3:
   Write a program to implement BGP (Border Gateway Protocol).
*/
public class A6_P3 {
    static class Route {
        String dest;
        List<String> asPath;
        public Route(String dest, List<String> asPath) {
            this.dest = dest;
            this.asPath = new ArrayList<>(asPath);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Simulating BGP (Path Vector Routing) ===");
        
        System.out.println("Scenario: AS1 wants to announce its network 10.0.0.0/8 to other ASes.\n");
        
        // AS1 to AS2
        List<String> pathAS1 = Arrays.asList("AS1");
        System.out.println("AS2 receives route to 10.0.0.0/8 with AS Path: " + pathAS1);
        
        // AS1 to AS3
        System.out.println("AS3 receives route to 10.0.0.0/8 with AS Path: " + pathAS1);
        
        // AS2 to AS4
        List<String> pathFromAS2 = new ArrayList<>();
        pathFromAS2.add("AS2");
        pathFromAS2.addAll(pathAS1);
        System.out.println("AS2 advertises to AS4: 10.0.0.0/8 with AS Path: " + pathFromAS2);
        
        // AS3 to AS4
        List<String> pathFromAS3 = new ArrayList<>();
        pathFromAS3.add("AS3");
        pathFromAS3.addAll(pathAS1);
        System.out.println("AS3 advertises to AS4: 10.0.0.0/8 with AS Path: " + pathFromAS3);
        
        System.out.println("\n-> AS4 receives multiple routes and selects the best path based on shortest AS path length:");
        if (pathFromAS2.size() <= pathFromAS3.size()) {
            System.out.println("   AS4 chooses path via AS2: " + pathFromAS2);
        } else {
            System.out.println("   AS4 chooses path via AS3: " + pathFromAS3);
        }
        
        System.out.println("\n--- BGP Loop Prevention Check ---");
        List<String> receivedPath = Arrays.asList("AS4", "AS2", "AS1");
        String myAS = "AS4";
        System.out.println("AS4 receives an update with AS Path: " + receivedPath);
        if(receivedPath.contains(myAS)) {
            System.out.println("-> Loop detected! AS4 rejects the route because it is already in the AS Path.");
        }
    }
}

/* Output:
=== Simulating BGP (Path Vector Routing) ===
Scenario: AS1 wants to announce its network 10.0.0.0/8 to other ASes.

AS2 receives route to 10.0.0.0/8 with AS Path: [AS1]
AS3 receives route to 10.0.0.0/8 with AS Path: [AS1]
AS2 advertises to AS4: 10.0.0.0/8 with AS Path: [AS2, AS1]
AS3 advertises to AS4: 10.0.0.0/8 with AS Path: [AS3, AS1]

-> AS4 receives multiple routes and selects the best path based on shortest AS path length:
   AS4 chooses path via AS2: [AS2, AS1]

--- BGP Loop Prevention Check ---
AS4 receives an update with AS Path: [AS4, AS2, AS1]
-> Loop detected! AS4 rejects the route because it is already in the AS Path.
*/
