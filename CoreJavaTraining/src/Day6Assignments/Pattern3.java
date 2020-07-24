package Day6Assignments;

public class Pattern3 {

//	   1
//     12
//     123
//     1234
//     12345
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)//loop for row
		{
			for(int j=1;j<=i;j++)//loop for column
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
