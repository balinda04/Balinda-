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

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Static method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Continue checking characters from both ends until they meet
        while (left < right) {
            // Ignore non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Check if characters at left and right positions are equal (ignoring case)
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            // Move to the next pair of characters
            left++;
            right--;
        }

        // If the loop completes without returning false, the string is a palindrome
        return true;
    }
}
