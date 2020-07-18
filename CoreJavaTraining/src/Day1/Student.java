package Day1;

public class Student {

	
	int age;
	int roll_no;
	
	public void display1()
	{
		System.out.println("Welcome to all of you ");
	}
	
	public void display2() {
		System.out.println("Automation is very easy");
	}
	
	
	public static void main(String[] args) {
		
		Student deepak=new Student();
		deepak.age=28;
		System.out.println(deepak.age);
		deepak.roll_no=1090;
		System.out.println(deepak.roll_no);
		deepak.display1();
		deepak.display2();
	}
}
