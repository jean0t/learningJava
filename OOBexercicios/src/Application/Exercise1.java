package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rectangle;

public class Exercise1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f"
				, rectangle.area()
				, rectangle.perimeter()
				, rectangle.diagonal());
		sc.close();
	}
}
