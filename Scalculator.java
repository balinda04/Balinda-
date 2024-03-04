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
public class Scalculator {
    public static void main(String[] args) {
        Scanner file = new Scanner(System.in);

        // Input the two numbers
        System.out.print("Please Enter the first number: ");
        int num1 = file.nextInt();
        System.out.print("Please Enter the second number: ");
        int num2 = file.nextInt();

        int sum = calSum(num1, num2);

        System.out.println("Sum of numbers between " + num1 + " and " + num2 + " is: " + sum);

        file.close();
    }

    // Static method to calculate the sum of all numbers between two given numbers
    public static int calSum(int num1, int num2) {
        int sum = 0;
        if (num1 > num2) {
            int number = num1;
            num1 = num2;
            num2 = number;
        }
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }
}

