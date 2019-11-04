class One
{
	//Main Method
	public static void main(String[]nah)
	{
		//Defining an Integer array
		int []arr = new int[100];

		//For loop to populate the array
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=i+1;
		}
		//For each loop to print the array
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}