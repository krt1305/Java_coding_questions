
public class ReverseEachWord {

	public static void main(String[] args) 
	{
		
		String s="Java Concept Of The Day";
		String reverseString="";
		String[] splitArr=s.split(" ");
		for(int i=0;i<splitArr.length;i++)
		{
			String word=splitArr[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
				
			}
			reverseString=reverseString+reverseWord;
		}
		System.out.println("Final reversed string is "+reverseString);
		
	}

}
