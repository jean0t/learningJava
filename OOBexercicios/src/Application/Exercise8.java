package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.Employees;

public class Exercise8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employees> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int numberOfEmployees = sc.nextInt();
		sc.nextLine();
		
		for (short i = 1; i <= numberOfEmployees; i++) {
			System.out.printf("Employee #%d%n", i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			list.add(new Employees(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int employeeId = sc.nextInt();
		sc.nextLine();
		
		Employee temp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (temp == null)
			System.out.println("The id does not exist!");
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			sc.nextLine();
			temp.increaseSalary(percentage);
		}
.		
		System.out.println();
		System.out.println("List of employees:");
		for (Employees employee : list) {
			System.out.println(employee.toString());
		}
		
		
		sc.close();	
	}
}
