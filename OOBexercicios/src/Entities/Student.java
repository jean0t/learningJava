package Entities;

public class Student {
	public double noteA, noteB, noteC;
	public String name = "Alex Green";
	
	public double finalGrade() {
		return this.noteA + this.noteB + this.noteC;
	}
	
	public boolean isPassed() {
		return (this.finalGrade() >= 60) ? true : false;
	}
}
