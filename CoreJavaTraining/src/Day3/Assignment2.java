package Day3;

public class Assignment2 {

	public void Method()
	{
		this.Method(10,20,10);
		System.out.println("Default Constructor");
	}
	public void Method(int a)
	{
		this.Method(1, 2);
		System.out.println("One parametrized Constructor");
	}
	public void Method(int a,int b)
	{
		this.Method(1, 2, 3, 4);
		System.out.println("Two parametrized Constructor");
	}
	public void Method(int a,int b,int c)
	{
		System.out.println("Three parametrized Constructor");
	}
	public void Method(int a,int b,int c,int d)
	{
		this.Method();
		System.out.println("Four parametrized Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Assignment2 a2= new Assignment2();
		 a2.Method(1);
	}

}
