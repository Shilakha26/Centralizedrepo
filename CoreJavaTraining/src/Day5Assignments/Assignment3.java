package Day5Assignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Prime number

		System.out.println("Enter values of number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Value of number : " + num);
		int var = 0;

		if (num == 0 || num == 1) {
			System.out.println("Not a prime number");
		}

		else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println("Not a Prime number");
					var = 1;
					break;
				}
			}
		}
		if (var == 0) {
			System.out.println("Prime number");
		}
	}

}
