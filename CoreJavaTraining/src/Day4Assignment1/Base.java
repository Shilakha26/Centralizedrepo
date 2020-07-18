package Day4Assignment1;

public class Base {

	public Base()
	{
		this(10,10,10,10);
		System.out.println("Parent: Default Constructor");
	}
	public Base(int a)
	{
		this();
		System.out.println("Parent: One parametrized Constructor");
	}
	public Base(int a,int b)
	{
		this(10,10,10);
		System.out.println("Parent: Two parametrized Constructor");
	}
	public Base(int a,int b,int c)
	{
		this(10);
		System.out.println("Parent: Three parametrized Constructor");
	}
	public Base(int a,int b,int c,int d)
	{
		System.out.println("Parent: Four parametrized Constructor");
	}
}
