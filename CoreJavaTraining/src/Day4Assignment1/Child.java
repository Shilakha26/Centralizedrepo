package Day4Assignment1;

public class Child extends Base {

	public Child() {
		this(10);
		System.out.println("Child: Default Constructor");
	}
	public Child(int a) {
		this(10,10,10);
		System.out.println("Child: One parametrized constructor ");
		
	}
	public Child(int a,int b) {
		
		System.out.println("Child: Two parameterized constructor");
	}
    public Child(int a,int b,int c) {
    	super(10,10);
		System.out.println("Child: Three parameterized constructor");
		
	}
    public Child(int a,int b,int c,int d) {
    	this();
		System.out.println("Child: Four parameterized constructor");
	}
	public static void main(String[] args) {
		
		Child c=new Child(10,20,20,10);
	}

}
