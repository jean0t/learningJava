import java.util.Scanner;

public class summing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short number = sc.nextShort(), result = 0;

		while (number != 0) {
			result += number;
			number = sc.nextShort();
		}

		System.out.printf("the result of the sum is: %d", result);
		sc.close();
	}
}
