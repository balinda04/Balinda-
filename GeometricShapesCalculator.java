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

public class GeometricShapesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle: " + circle.calculateArea());

        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        // Triangle
        System.out.print("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);
        System.out.println("Area of the triangle: " + triangle.calculateArea());

        scanner.close();
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}
