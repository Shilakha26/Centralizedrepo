package Day4Assignment2;

public class Child extends Base {
//Assignment2
	public void m2() {

		this.m2(10);
		System.out.println("Child: Default Constructor");
	}

	public void m2(int a) {

		this.m2(10, 20, 10);
		System.out.println("Child: One parametrized constructor ");

	}

	public void m2(int a, int b) {

		System.out.println("Child: Two parameterized constructor");
	}

	public void m2(int a, int b, int c) {
         super.m1(10,20);
		System.out.println("Child: Three parameterized constructor");

	}

	public void m2(int a, int b, int c, int d) {
		
        this.m2();
		System.out.println("Child: Four parameterized constructor");
	}

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.m2(10,10,20,30);

	}

}
