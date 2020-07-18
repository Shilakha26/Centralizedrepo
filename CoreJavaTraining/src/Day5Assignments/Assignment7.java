package Day5Assignments;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Table print
		int c;
		System.out.println("Enter values of number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		System.out.println("Printing table for "+num);
		
		for (c = 1; c <= 10; c++)
			{
		      System.out.println(num + "*" + c + " = " + (num*c));
		    }
	}

}
