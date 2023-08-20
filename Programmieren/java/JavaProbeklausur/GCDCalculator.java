package JavaProbeklausur;

import java.util.Scanner;

public class GCDCalculator {

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        while (b > 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Geben Sie den Wert von a ein: ");
        int a = scanner.nextInt();
        
        System.out.print("Geben Sie den Wert von b ein: ");
        int b = scanner.nextInt();
        
        scanner.close();
        
        int gcd = calculateGCD(a, b);
        System.out.println("Größter gemeinsamer Teiler von " + a + " und " + b + ": " + gcd);
    }
}