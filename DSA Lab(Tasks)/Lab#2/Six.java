
  public class Six { 
  
    static int sortRowWise(int arr[][]) 
    { 
        // loop for rows of matrix 
        for (int i = 0; i < arr.length; i++) { 
  
            // loop for column of matrix 
            for (int j = 0; j < arr[i].length; j++) { 
  
                // loop for comparison and swapping 
                for (int k = 0; k < arr[i].length - j - 1; k++) { 
                    if (arr[i][k] > arr[i][k + 1]) { 
  
                        // swapping of elements 
                        int temp = arr[i][k]; 
                        arr[i][k] = arr[i][k + 1]; 
                        arr[i][k + 1] = temp; 
                    } 
                } 
            } 
        } 
  
        // printing the sorted matrix 
        for(int x=0,y=0;x<arr.length;) {
        	if(y<arr[x].length) {
        		System.out.print(arr[x][y]+" ");
        		y++;
        	}
        	else {	
        		System.out.println();
        		y=0;
        		x++;
        	} 
        } 
  
        return 0; 
    } 
  
  //Main Method 
    public static void main(String args[]) 
    { 
    	//Initializing a 2D array
        int array2D[][] = { { 9, 8, 7, 1 }, 
                      { 7, 3, 0, 2 }, 
                      { 9, 5, 3, 2 }, 
                      { 6, 3, 1, 2 } };
        //Calling method 
        sortRowWise(array2D); 
    } 
}