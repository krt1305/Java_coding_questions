import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfAllArrays {

	static void union(int[]...inputArrays)
	{
		HashSet<Integer> unionSet=new HashSet<Integer>();
        for(int[] inputArray:inputArrays)
        {
        	for(int i:inputArray)
        	{
        		unionSet.add(i);
        	}
        }
        System.out.println("===========================");
        
        System.out.println("Union Of All Input Arrays :");
         
        System.out.println("===========================");
         
        System.out.println(unionSet);
        ArrayList arr=new ArrayList();
    
	}
	
	public static void main(String[] args)
	{
	
		
		int[] inputArray1 = {2, 3, 4, 7, 1};
        
        int[] inputArray2 = {4, 1, 3, 5};
         
        int[] inputArray3 = {8, 4, 6, 2, 1};
         
        int[] inputArray4 = {7, 9, 4, 1};
        union(inputArray1,inputArray2,inputArray3,inputArray4);
        
        
		


	}

}
