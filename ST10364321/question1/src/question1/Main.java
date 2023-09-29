/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question1;

/**
 *
 * @author karan
 */

    import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Capture New Student");
            System.out.println("2. Search for Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View Student Report");
            System.out.println("5. Exit");

            int choice = kb.nextInt();
            kb.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Student ID:");
                    String id = kb.nextLine();
                    System.out.println("Enter Student Name:");
                    String name = kb.nextLine();
                    System.out.println("Enter Student Age:");
                    int age = kb.nextInt();
                    Student.saveStudent(id, name, age);
                }
                case 2 -> {
                    System.out.println("Enter Student ID to Search:");
                    String searchID = kb.nextLine();
                    Student.searchStudent(searchID);
                }
                case 3 -> {
                    System.out.println("Enter Student ID to Delete:");
                    String deleteID = kb.nextLine();
                    Student.deleteStudent(deleteID);
                }
                case 4 -> Student.studentReport();
                case 5 -> {
                    System.out.println("Exiting Application. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}

class Student {
    private static final ArrayList<Student> students = new ArrayList<>();
    
    private final String studentID;
    private final String name;
    private final int age;
    // Other student attributes can be added as needed

    // Constructor
    public Student(String studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    // Getters and setters can be added as needed

    // Method to save a student
    public static void saveStudent(String studentID, String name, int age) {
        if (age >= 16) {
            Student student = new Student(studentID, name, age);
            students.add(student);
            System.out.println("Student details successfully saved.");
        } else {
            System.out.println("Invalid student age. Age must be 16 or older.");
        }
    }

    // Method to search for a student
    public static void searchStudent(String studentID) {
        for (Student student : students) {
            if (student.studentID.equals(studentID)) {
                System.out.println("Student Details: ");
                System.out.println("ID: " + student.studentID);
                System.out.println("Name: " + student.name);
                System.out.println("Age: " + student.age);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to delete a student
    public static void deleteStudent(String studentID) {
        students.removeIf(student -> student.studentID.equals(studentID));
        System.out.println("Student deleted successfully.");
    }

    // Method to generate student report
    public static void studentReport() {
        System.out.println("Student Report:");
        for (Student student : students) {
            System.out.println("ID: " + student.studentID + ", Name: " + student.name + ", Age: " + student.age);
        }
    }

}
    

