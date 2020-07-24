package Day6Assignments;

public class Pattern4 {

	
//    1
//    2 3
//    4 5 6
//    7 8 9 10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=1;
		for (int i = 1; i <= 4; i++) //rows
        {
            for (int j = 1; j <= i; j++) //columns
            {
                System.out.print(value+"\t");
                 
                value++;
            }
            System.out.println();
        }
	}

}
