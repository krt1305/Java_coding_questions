
public class fibonacci {

	public static void main(String[] args)
	{
		//17711 - is a fibonacci number
		int n=17711;
		int firstTerm=0;
		int secondTerm=1;
		int thirdTerm=0;
		while(thirdTerm<n)
		{
			thirdTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=thirdTerm;
		}
		
		if(thirdTerm==n)
			
		{
			System.out.println("NUmber belongs to fibonacci series");
		}
		else
		{
			System.out.println("NUmber doesnt belong to fibonacci series");
		}


	}

}
