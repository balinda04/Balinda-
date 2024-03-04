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

public class StudentRecordsManager {
    static final int MAX_STUDENTS = 100; // Maximum number of students
    static final double PASSING_GRADE = 60.0; // Passing grade
    static Student[] students = new Student[MAX_STUDENTS]; // Array to store students
    static int studentCount = 0; // Counter to keep track of the number of students

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu loop
        while (true) {
            System.out.println("\nStudent Records Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Display Student Records");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    updateStudent(scanner);
                    break;
                case 3:
                    displayStudentRecords();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    // Method to add a new student
    public static void addStudent(Scanner scanner) {
        if (studentCount < MAX_STUDENTS) {
            System.out.println("\nEnter Student Details:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade: ");
            double grade = scanner.nextDouble();

            students[studentCount] = new Student(id, name, grade);
            studentCount++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Maximum number of students reached.");
        }
    }

    // Method to update an existing student's details
    public static void updateStudent(Scanner scanner) {
        if (studentCount > 0) {
            System.out.print("Enter student ID to update: ");
            int id = scanner.nextInt();
            int index = findStudentIndex(id);
            if (index != -1) {
                System.out.println("Enter updated details:");
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Grade: ");
                double grade = scanner.nextDouble();

                students[index].setName(name);
                students[index].setGrade(grade);
                System.out.println("Student details updated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } else {
            System.out.println("No students to update.");
        }
    }

    // Method to display student records
    public static void displayStudentRecords() {
        if (studentCount > 0) {
            System.out.println("\nStudent Records:");
            for (int i = 0; i < studentCount; i++) {
                System.out.println(students[i]);
            }
        } else {
            System.out.println("No students to display.");
        }
    }

    // Method to find index of a student in the array based on ID
    public static int findStudentIndex(int id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1; // Student not found
    }
}

class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // toString method to display student details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}
