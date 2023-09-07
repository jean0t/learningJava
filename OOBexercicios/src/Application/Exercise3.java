package Application;

import java.util.Scanner;
import java.util.Locale;
import Entities.Student;

public class Exercise3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println(student.name);
		student.noteA = sc.nextDouble();
		student.noteB = sc.nextDouble();
		student.noteC = sc.nextDouble();
		
		System.out.println("Note: " + student.finalGrade());
		
		if (student.isPassed())
			System.out.println("PASSED");
		else
			System.out.printf("FAILED%nNeeds %.2f more points", 60 - student.finalGrade());
		
		sc.close();
	}
}
