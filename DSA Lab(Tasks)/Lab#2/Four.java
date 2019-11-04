class Four
{
	public static float averageArray(float[]arr)
	{
		//Local variable
		float average = 0;
		//Loop to sum all the elements of the array
		for(int a=0;a<arr.length;a++)
		{
			average+=arr[a];
		}
		//Taking the average out by formula
		average=(average/arr.length);
		//returning average
		return average;
	}
	//Main Method
	public static void main(String[]nah)
	{
		//Initializing a float array
		float []arr = {1.8,5.3,2.3};
		//Calling averageArray method and passing argument
		System.out.print("The average of entire array is: "+averageArray(arr));
	}
}