// Q10: Write a program to implement HTTP Request and Response
import java.util.Scanner;

public class A4_P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simulating HTTP Interaction");
        System.out.print("Enter URL to request (e.g., www.example.com): ");
        String url = sc.next();
        
        System.out.println("\n--- HTTP Request ---");
        System.out.println("GET / HTTP/1.1");
        System.out.println("Host: " + url);
        System.out.println("Connection: keep-alive");
        System.out.println("User-Agent: Java Console Agent\n");
        
        System.out.println("--- HTTP Response (Simulated) ---");
        System.out.println("HTTP/1.1 200 OK");
        System.out.println("Content-Type: text/html");
        System.out.println("Content-Length: 125");
        System.out.println();
        System.out.println("<html>");
        System.out.println("<head><title>Welcome</title></head>");
        System.out.println("<body><h1>Hello from " + url + "</h1></body>");
        System.out.println("</html>");
    }
}

/*
Sample Output:
Simulating HTTP Interaction
Enter URL to request (e.g., www.example.com): www.google.com

--- HTTP Request ---
GET / HTTP/1.1
Host: www.google.com
Connection: keep-alive
User-Agent: Java Console Agent

--- HTTP Response (Simulated) ---
HTTP/1.1 200 OK
Content-Type: text/html
Content-Length: 125

<html>
<head><title>Welcome</title></head>
<body><h1>Hello from www.google.com</h1></body>
</html>
*/
