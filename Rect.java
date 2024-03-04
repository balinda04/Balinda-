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
public class Rect {
    
    private double length;
    private double width;

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        Rect angle = new Rect(length, width);

        double area = angle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        double perimeter = angle.calculatePerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}
