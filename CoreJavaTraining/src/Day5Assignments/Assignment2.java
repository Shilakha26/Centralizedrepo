package Day5Assignments;

import java.util.Scanner;

public class Assignment2 {

	// Swapping without using third variable:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********Before Swapping*************");
		System.out.println("Enter values of number1");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		System.out.println("Value of number1: "+num1);
		
		System.out.println("Enter values of number2");
		Scanner s1=new Scanner(System.in);
		int num2=s.nextInt();
		System.out.println("Value of number2: "+num2);
		
		num1=num1-num2;
		num2=num1+num2;
		num1=num2-num1;
		
		System.out.println("*********After Swapping*************");
		
		System.out.println("Value of number1: "+num1);
		System.out.println("Value of number2: "+num2);
	}

}
