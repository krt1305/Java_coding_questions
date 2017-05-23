import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SynchronizedArraylist {

	public static void main(String[] args)
	{
	
		//SYNCHRONISED ARRAY LIST
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("JAVA");
		list.add("C#");
		list.add("JSP");
		list.add("SERVLETS");
		
		List <String> syncList=Collections.synchronizedList(list);
		synchronized(syncList)
		{
			Iterator<String> it=syncList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		//SYNCHRONISED HASHSET
		HashSet<String> set=new HashSet<String>();
		set.add("JAVA");
		set.add("C#");
		set.add("JSP");
		
		Set <String> syncSet=Collections.synchronizedSet(set);
		synchronized(syncSet)
		{
			Iterator<String> it=syncList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		
		
		
	}

}
