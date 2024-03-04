

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20application;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Maxcal {
    

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = key.nextDouble();
        double num2 = key.nextDouble();
        double num3 = key.nextDouble();

        double largest = Larger(num1, num2, num3);

        System.out.println("The largest number is: " + largest);

        key.close();
    }

    public static double Larger(double num1, double num2, double num3) {
        double largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        return largest;
    }
}
