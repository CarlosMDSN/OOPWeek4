package ie.atu.week4;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        // Create a Scanner object to collect user input
        Scanner scanner = new Scanner(System.in);

        // Collect data for Student 1 (default constructor)
        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Email: ");
        String email1 = scanner.nextLine();
        System.out.print("Course: ");
        String course1 = scanner.nextLine();

        // Create Student 1 using the default constructor and setters
        Student student1 = new Student();
        student1.setName(name1);
        student1.setEmail(email1);
        student1.setCourse(course1);

        // Collect data for Student 2 (constructor with name only)
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Email: ");
        String email2 = scanner.nextLine();
        System.out.print("Course: ");
        String course2 = scanner.nextLine();

        // Create Student 2 using the constructor that accepts the name only
        Student student2 = new Student(name2);
        student2.setEmail(email2);
        student2.setCourse(course2);

        // Collect data for Student 3 (constructor with all parameters)
        System.out.println("\nEnter details for Student 3:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Email: ");
        String email3 = scanner.nextLine();
        System.out.print("Course: ");
        String course3 = scanner.nextLine();

        // Create Student 3 using the constructor that accepts name, email, and course
        Student student3 = new Student(name3, email3, course3);

        // Print details for each student using getter methods
        System.out.println("\nStudent 1 Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Email: " + student1.getEmail());
        System.out.println("Course: " + student1.getCourse());

        System.out.println("\nStudent 2 Details:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Email: " + student2.getEmail());
        System.out.println("Course: " + student2.getCourse());

        System.out.println("\nStudent 3 Details:");
        System.out.println("Name: " + student3.getName());
        System.out.println("Email: " + student3.getEmail());
        System.out.println("Course: " + student3.getCourse());

        // Close the scanner object
        scanner.close();
    }
}
