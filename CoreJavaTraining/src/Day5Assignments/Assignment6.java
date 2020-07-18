package Day5Assignments;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Armstrong number
		
		int r = 0;
		int c = 0;
		
		int temp;
		
		System.out.println("Enter values of number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		temp=num;
		System.out.println("Value of number : " + num);

		while (num > 0) {
			r = num % 10;
			num=num/10;
			c = c +(r*r*r);
			
		}
		
		if(temp==c) {
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
	}

}
