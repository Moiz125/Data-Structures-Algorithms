class Five
{
	//Method takes array as argument and returns index of second largest element in the array
	public static int secLargest(int[] arr)
	{
		//instance variable
		int max = arr[0];
		int a;
		int index = 0;
		int secmax = arr[0];
		//Loop to find largest element in array
		for(a=0;a<arr.length;a++)
		{
			if(arr[a]>max)
			{
				max=arr[a];
			}
		}
		//Loop to find second largest element in array
		for(a=0;a<arr.length-1;a++)
		{
			if(arr[a]>secmax && arr[a]<max)
			{
				secmax=arr[a];
				index=a;
			}
		}
		//returning index of second largest element in array
		return index;
	}
	//Main Method
	public static void main(String[]nah)
	{
		//instance integer array
		int arr[] = {5,2,3,4,9};
		System.out.print(secLargest(arr));
	}
}