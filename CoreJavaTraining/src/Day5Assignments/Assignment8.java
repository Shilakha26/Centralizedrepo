package Day5Assignments;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Factorial of number
		
		System.out.println("Enter values of number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Value of number : " + num);
		int fact=1;
		for(int i=1;i<=num;i++)
		{    
		      fact=fact*i;    
		 }   
		System.out.println("Factorial of "+num+" is: "+fact);  
	}

}
