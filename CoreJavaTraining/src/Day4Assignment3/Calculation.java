package Day4Assignment3;

import java.util.Scanner;

public class Calculation {
 
	// ((((x1+x2)-x3)+x4)*x5)/x6)
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Calculation obj =new Calculation();
		System.out.println("Enter values of x1");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		System.out.println("Value of x1: "+x1);
		System.out.println("Enter values of x2");
		int x2=s.nextInt();
		System.out.println("Value of x2: "+x2);
		System.out.println("Enter values of x3");
		int x3=s.nextInt();
		System.out.println("Value of x3: "+x3);
		System.out.println("Enter values of x4");
		int x4=s.nextInt();
		System.out.println("Value of x4: "+x4);
		System.out.println("Enter values of x5");
		int x5=s.nextInt();
		System.out.println("Value of x5: "+x5);
		System.out.println("Enter values of x6");
		int x6=s.nextInt();
		System.out.println("Value of x6: "+x6);
		int sum=obj.sum(x1, x2);
		int sub=obj.sub(sum, x3);
		int sum1=obj.sum(sub, x4);
		int mul=obj.mul(sum1, x5);
		int f=obj.div(mul, x6);
		System.out.println("Result : "+ f);
				
	}

}
