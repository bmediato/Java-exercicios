import entities.Employee;
//import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Rectangle rectangle = new Rectangle();
//
//        System.out.println("Enter rectangle width and height: ");
//        rectangle.width = sc.nextDouble();
//        rectangle.heidht = sc.nextDouble();
//
//        System.out.printf("AREA = %.2f%n", rectangle.Area());
//        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
//        System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagnoal());

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();

        System.out.println("Employee: " + employee.toString());
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + employee);

        sc.close();
    }
}