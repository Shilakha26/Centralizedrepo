package Day5Assignments;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fibonnaci series
		
	    int n = 10, t1 = 0, t2 = 1;
        System.out.print("Fibonnaci series for first "+n+ " terms:  ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    
	}

}
