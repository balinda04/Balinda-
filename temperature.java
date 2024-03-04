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
/**
 *
 * @author user
 */

public class temperature {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Enter the temperature:");
        double temperature = key.nextDouble();

        System.out.println("Enter 1 to convert from Celsius to Fahrenheit");
        System.out.println("Enter 2 to convert from Fahrenheit to Celsius");
        int cel = key.nextInt();

        double convertedTemperature;
        if (cel == 1) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
        } else if (cel == 2) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println("Temperature in Celsius: " + convertedTemperature);
        } else {
            System.out.println("Invalid choice. Please enter either 1 or 2.");
        }

        key.close();
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
