package Day2;

public class Assignment3 {
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
		Assignment3 a3=new Assignment3();
		int a=a3.mul(10, 2);
		int b=a3.sub(a, 2);
		int c=a3.sum(b, 2);
		int d=a3.sub(c, 2);
		a3.div(d, 2);
	}

}
