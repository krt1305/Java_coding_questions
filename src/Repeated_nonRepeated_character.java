import java.util.HashMap;

public class Repeated_nonRepeated_character {

	public static void main(String[] args)
	{
		String input="anmcc";
		HashMap<Character,Integer> charCount=new HashMap<Character,Integer>();
		char[] inputArr=input.toCharArray();
		for(char c : inputArr)
		{
			if(charCount.containsKey(c))
			{
				charCount.put(c, charCount.get(c)+1);
			}
			else
			{
				charCount.put(c, 1);
			}
				
		}
		
		//Find first repeated character
		for(char c:inputArr)
		{
			if(charCount.get(c)>1)
			{
				System.out.println("First repeated character "+c);
				break;
			}
		}
		
		//First non repeated charcater
		for(char c :inputArr)
		{
			if(charCount.get(c)==1)
			{	
				System.out.println("First non character "+c);
				break;
			}
		}


	}

}
