import entities.Employee;
import entities.Student;
//import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
// RECTANGLE
//        Rectangle rectangle = new Rectangle();
//
//        System.out.println("Enter rectangle width and height: ");
//        rectangle.width = sc.nextDouble();
//        rectangle.heidht = sc.nextDouble();
//
//        System.out.printf("AREA = %.2f%n", rectangle.Area());
//        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
//        System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagnoal());

        // EMPLOYEE
//        Employee employee = new Employee();
//        System.out.print("Name: ");
//        employee.name = sc.nextLine();
//        System.out.print("Gross salary: ");
//        employee.grossSalary = sc.nextDouble();
//        System.out.print("Tax: ");
//        employee.tax = sc.nextDouble();
//        System.out.println();
//
//        System.out.println("Employee: " + employee.toString());
//        System.out.println();
//        System.out.print("Which percentage to increase salary? ");
//        double percentage = sc.nextDouble();
//        employee.increaseSalary(percentage);
//
//        System.out.println();
//        System.out.println("Update data: " + employee);

        // STUDENT
        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60.0) {
            System.out.println("FAILD");
            System.out.printf("MISSING %.2f POINTS %n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}