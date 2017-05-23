
public class ReversePalindrome {

	public static void main(String[] args) 
	{
		
		//http://javaconceptoftheday.com/how-to-reverse-and-add-number-until-you-get-palindrome/
			int n=123;
			
			checkPalindrome(n);
			
			
	}
	
	public static boolean checkPalindrome(int n)
	{
		int reversedNo=reverseNumber(n);
		if(n==reversedNo)
		{
			
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
	
	public static void reverseAndAdd(int number)
	{
		
			if(checkPalindrome(number))
			{
				System.out.println("Number is already a palindrome");
			}
			else
			{
				while(!checkPalindrome(number))
				{
					int reverse=reverseNumber(number);
					int sum=number+reverse;
					number=sum;
				}
				
				
			}
	}
	
	
	public static int reverseNumber(int n)
	{
		int rem,reverse = 0;
		while(n !=0)
		{
			rem=n%10;
			reverse=(reverse*10)+rem;
			n=n/10;
			
			
		}
		System.out.println("Reverse of the number is "+reverse);
		return reverse;
	
	}

}
