package Day3;

public class Assignment1 {
	
	public Assignment1()
	{
		this(10,1,2,4);
		System.out.println("Default Constructor");
	}
	public Assignment1(int a)
	{
		this();
		System.out.println("One parametrized Constructor");
	}
	public Assignment1(int a,int b)
	{
		this(10,10,10);
		System.out.println("Two parametrized Constructor");
	}
	public Assignment1(int a,int b,int c)
	{
		this(10);
		System.out.println("Three parametrized Constructor");
	}
	public Assignment1(int a,int b,int c,int d)
	{
	
		System.out.println("Four parametrized Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 obj=new Assignment1(10,20);
		
	}

}
