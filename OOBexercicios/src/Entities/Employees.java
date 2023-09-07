package Entities;

public class Employees {
	private int id;
	private String name;
	private double salary;
	
	public Employees (int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void salaryIncrease(double percentage) {
		this.salary *= 1 + percentage / 100;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	
}
