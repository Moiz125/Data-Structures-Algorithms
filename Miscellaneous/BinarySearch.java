public class BinarySearch
{
    //Method to find particular elements in an array
    public static String method(int[]arr,int x)
    {
        int up = 0;
        int low = arr.length-1;
        while(low>=up)
        {
            int i = (low+up)/2;
            if(arr[i]==x)
            {
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
        return "Not found";
    }
    public static void main(String[]nah)
    {
        //Initialized integer array
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,31,41,51,61,71};
        int x=81;
        //Calling method and giving arguments
        System.out.print(method(arr,x));
    }
}