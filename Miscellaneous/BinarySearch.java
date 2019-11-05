public class BinarySearch
{
    //Method to find particular elements in an array
    public static String method(int[]arr,int x)
    {
        //initializing variable with starting and ending index of the Array
        int up = 0;
        int low = arr.length-1;
        while(low>=up)
        {
            int i = (low+up)/2;
            if(arr[i]==x)
            {
                //Break out of loop if element if found
                return "Found at index: "+i;
            }
            if(arr[i]>x)
            {
                low = i-1;
            }
            if(arr[i]<x)
            {
                up = i+1;
            }
        
        }
        //Return not found if element is not found in the array
        return "Not found";
    }
    //Main Method
    public static void main(String[]nah)
    {
        //Initialized integer array
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,31,41,51,61,71};
        int x=81;
        //Calling method and giving arguments
        System.out.print(method(arr,x));
    }
}
