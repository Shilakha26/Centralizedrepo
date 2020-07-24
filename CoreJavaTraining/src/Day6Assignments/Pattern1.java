package Day6Assignments;

public class Pattern1 {
	
	
//	   *
//     **
//     ***
//     ****

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<=4;i++)//loop for row
		{
			for(int j=1;j<=i;j++)//loop for column
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
