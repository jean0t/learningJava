package Application;

import java.util.Scanner;
import java.util.Locale;

import Entities.Employee;

public class Exercise2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s%n%n", employee.toString());
		
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("");
		System.out.printf("Updated data: %s", employee.toString());
		sc.close();
	}
}
