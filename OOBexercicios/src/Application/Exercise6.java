package Application;

import java.util.Scanner;
import java.util.Locale;

public class Exercise6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		if (n > 10) {
			System.out.println("Valor máximo aceito é 10. Digite 10 números");
			n = 10;
		}
		
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for (int result : vect) {
			if (result < 0)
				System.out.println(result);
		}
		
		sc.close();
	}

}
