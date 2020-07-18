package Day2;

public class Assignment2 {

	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		return c;
	}	
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public void div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("Final result is: "+c);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 a2=new Assignment2();
		int a=a2.sub(10, 2);
		int b=a2.sum(a, 2);
		int c=a2.sum(b, 2);
		int d=a2.mul(c, 2);
		a2.div(d, 2);
		
	}

}
