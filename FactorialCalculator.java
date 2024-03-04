/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20application;

/**
 *
 * @author uyser
 */
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Calculate factorial
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("Factorial of " + number + " = " + factorial);

        scanner.close();
    }

    // Static recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }
        return n * calculateFactorial(n - 1); // Recursive call to calculate factorial
    }
}
