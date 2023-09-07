package Entities;

public class Employee {
	public String name;
	public double grossSalary, tax;

	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += (percentage / 100) * this.grossSalary;
	}
	
	public String toString() {
		return this.name + ", $ " + Math.round(this.netSalary() * 100)/100;
	}
}
