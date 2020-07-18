package Day5Assignments;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Palindrome number

		int r = 0;
		int reversednum = 0;
		
		int temp;
		
		System.out.println("Enter values of number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		temp=num;
		System.out.println("Value of number : " + num);

		while (num != 0) {
			r = num % 10;
			reversednum = reversednum * 10 + r;
			num=num/10;
		}
		
		if(temp==reversednum) {
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	}

}
