

public class anagram {

	public static void main(String[] args)
	{
		String s1="Mother In Law";
		String s2="Hitler Woman";
		s1=s1.replaceAll("\\s", "").toLowerCase().trim();
		s2=s2.replaceAll("\\s", "").toLowerCase().trim();
		boolean anagram=false;
		
		//If both have diff lengths they are not anagrams
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are not anagrams");
		}
		else 
		{
			//Convert both of them to same case
			
			System.out.println("FInal s1 is "+s1);
			System.out.println("Final s2 is "+s2);
			
			
			char[] s1ToArray=s1.toCharArray();
			for(char c : s1ToArray)
			{
				int index=s2.indexOf(c);
				System.out.println("Character "+c + "found at index" + index);
				if(index!=-1)
				{
					s2 = s2.substring(0, index)+s2.substring(index+1, s2.length());			
					//System.out.println("Strings are not anagrams");
				}
				else
				{
					anagram=false;
					break;
				
					//System.out.println("Strings are anagrams");
				}
			}
			
			
		}
		if(anagram)
		{
			System.out.println("Strings are anagrams");
		}
		else
		{	
			System.out.println("Strings are not anagrams");
		}

	}

}
