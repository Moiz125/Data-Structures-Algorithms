//Importing Package for using sort Function provided by Array Class
import java.util.*;
class Seven 
{
	//Main Method
	public static void main(String[]nah)
	{
		//Variable to Count no: of Duplicate Elements
		int count=0;
		int arr[]={10,10,10,20,20,10,20,20,20,10,40,50,30,30};
		//Sorting array
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i]==arr[i+1] || arr[i]==arr[i+2])
				count++;	

		}
		System.out.println("New Length of Array is "+(arr.length-count));	
	}
}