package Day4Assignment2;

public class Base {
// Assignment-2

	public void m1() {
        this.m1(10, 20, 10, 10);
		System.out.println("Parent: Default Method");
	}

	public void m1(int a) {
         this.m1();
		System.out.println("Parent: 1 parametrized Method ");
	}

	public void m1(int a, int b) {
		this.m1(10, 10, 50);
		System.out.println("Parent: 2 parametrized Method");
	}

	public void m1(int a, int b, int c) {
		this.m1(10);
		System.out.println("Parent: Three parametrized Method");
	}

	public void m1(int a, int b, int c, int d) {
		System.out.println("Parent: Four parametrized Method");
	}
}
