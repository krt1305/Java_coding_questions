
public class SymmetricMatrix {

	public static void main(String[] args)
	{

		int matrix[][]=new int[2][2];
		matrix[0][0]=7;
		matrix[0][1]=5;
		matrix[1][0]=6;
		matrix[1][1]=7;
		boolean symmetric = true;
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				if(matrix[i][j]!=matrix[j][i])
				{
					symmetric=false;
					break;
				}
			}
		}
		if(symmetric)
        {
            System.out.println("The given matrix is symmetric...");
        }
        else
        {
            System.out.println("The given matrix is not symmetric...");
        }
		
	
		
		
	}

}
