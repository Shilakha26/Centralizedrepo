package Day2;

public class Assignment1 {
	
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
		
		Assignment1 a1=new Assignment1();
		int p=a1.sum(10, 2);
		int q=a1.sub(p, 2);
		int r=a1.mul(q, 2);
		int s=a1.sum(r, 2);
		a1.div(s, 2);
	}

}
