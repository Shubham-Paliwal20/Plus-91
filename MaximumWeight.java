




import java.util.*;
 
public class MaximumWeight {
     
    public static int solve(int array[], int n,
                                        int k)
    {
        
        Arrays.sort(array);
      
        
        int sum = 0, sum1 = 0, sum2 = 0;
      
        
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
      
       
        for (int i = 0; i < k; i++) {
            sum1 += array[i];
        }
      
        // Getting the sum of (n-k) elements
        for (int i = k; i < n; i++) {
            sum2 += array[i];
        }
      
        // Returning the maximum possible difference.
        return Math.max(Math.abs(sum1 - (sum - sum1)),
                       Math.abs(sum2 - (sum - sum2)));
    }
}
     
    
    
	
	
	
	
	

}
