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

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Call the static method to reverse the string
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    // Static method to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
