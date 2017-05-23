
public class DuplicatesInArray {

	public static void main(String[] args) 
	{
		
		int [] arr={1,9,8,6,9,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
		}
		
		System.out.println("Array after adding zeroes");
		for(int g=0;g<=arr.length-1;g++)
		{
			System.out.println(arr[g]);
		}

	}

}
