import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Line_word_character_count_file {

	public static void main(String[] args) throws IOException
	{

		BufferedReader reader=null;
		int lineCount=0;
		int wordCount=0;
		int charCount=0;
		
		try {
			reader=new BufferedReader(new FileReader(""));
			
			String currentLine=reader.readLine();
			while(currentLine!=null)
			{
				lineCount++;
				String[] words=currentLine.split(" ");
				wordCount=wordCount+words.length;
				for(String word:words)
				{
					charCount=charCount+word.length();
				}
				currentLine=reader.readLine();
			}
			
			
			
		} catch 
		(FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
