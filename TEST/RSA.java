import java.util.Scanner;

public class RSA {
    // Helper method to calculate greatest common divisor
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute modular inverse using Extended Euclidean Algorithm
    public static int modInverse(int a, int m) {
        int m0 = m;
        int y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x += m0;

        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p, q;
        System.out.print("Enter prime number p: ");
        p = scanner.nextInt();
        System.out.print("Enter prime number q: ");
        q = scanner.nextInt();
        int n = p * q;
        int phi = (p - 1) * (q - 1);
        int e;
        System.out.print("Enter prime number e: ");
        e = scanner.nextInt();

        // Check if e is vali'd
        if (gcd(e, phi) != 1) {
            System.out.println("Invalid e: gcd(e, phi) must be 1");
            return;
        }

        // Calculate d as modular inverse of e modulo phi
        int d = modInverse(e, phi);

        System.out.println("Public key: (" + e + ", " + n + ")");
        System.out.println("Private key: (" + d + ", " + n + ")");

        scanner.close();
    }
}