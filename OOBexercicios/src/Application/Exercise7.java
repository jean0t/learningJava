package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Person;

public class Exercise7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int numberOfPeople = sc.nextInt();
		sc.nextLine();
		Person[] person = new Person[numberOfPeople];
		
		for (int i = 0; i < person.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			
			person[i] = new Person(nome, idade, altura);
		}
		
		double sum = 0.0;
		int lessThan16Years = 0;
		for (Person element : person) {
			sum += element.altura;
			if (element.idade < 16)
				lessThan16Years += 1;
		}
		
		double mean = sum / person.length;
		double percentage = ((double) lessThan16Years / person.length) * 100;
		
		System.out.printf("Altura média: %.2f%n", mean);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);
		for (Person element : person) {
			if (element.idade < 16)
				System.out.println(element.nome);
		}
		
		sc.close();
	}
}
