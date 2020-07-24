package Day6Assignments;

public class Pattern2 {

//	  *****
//    ****
//    ***
//    **
//    *
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)//loop for row
		{
			for(int j=5; j >= i; j--)//loop for column
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
