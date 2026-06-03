// Q2: Write a program to implement CRC (Cyclic Redundancy Check)
import java.util.Scanner;

public class A4_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data bits: ");
        String data = sc.next();
        System.out.print("Enter generator polynomial bits: ");
        String generator = sc.next();
        
        String appendedData = data;
        for (int i = 0; i < generator.length() - 1; i++) {
            appendedData += "0";
        }
        
        String remainder = divide(appendedData, generator);
        System.out.println("CRC Code (Remainder): " + remainder);
        System.out.println("Transmitted Data: " + data + remainder);
    }
    
    public static String divide(String div, String generator) {
        int pointer = generator.length();
        String result = div.substring(0, pointer);
        
        for (int i = 0; i < generator.length(); i++) {
            if (result.charAt(i) == generator.charAt(i))
                result = result.substring(0, i) + "0" + result.substring(i + 1);
            else
                result = result.substring(0, i) + "1" + result.substring(i + 1);
        }
        
        while (pointer < div.length()) {
            if (result.charAt(0) == '0') {
                result = result.substring(1) + div.charAt(pointer);
                pointer++;
            } else {
                String nextResult = "";
                for (int i = 0; i < generator.length(); i++) {
                    if (result.charAt(i) == generator.charAt(i))
                        nextResult += "0";
                    else
                        nextResult += "1";
                }
                result = nextResult.substring(1) + div.charAt(pointer);
                pointer++;
            }
        }
        
        if (result.charAt(0) == '1') {
            String nextResult = "";
            for (int i = 0; i < generator.length(); i++) {
                if (result.charAt(i) == generator.charAt(i))
                    nextResult += "0";
                else
                    nextResult += "1";
            }
            result = nextResult;
        }
        return result.substring(1);
    }
}

/*
Sample Output:
Enter data bits: 1101011011
Enter generator polynomial bits: 10011
CRC Code (Remainder): 1110
Transmitted Data: 11010110111110
*/
