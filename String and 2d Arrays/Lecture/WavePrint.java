
public class Solution {

	
	// input - input 2D array
	public static void wavePrint(int input[][]){
		
		// Write your code here
      
      int n=input[0].length;
      for(int i=0;i<n;i++)
      {
        
        for(int j=0;j<input.length;j++)
        {
          System.out.print(input[j][i]+" ");
        }
        
        i++;
        
   		if(i<n)
        {
             for(int j=input.length-1;j>=0;j--)
              {
                System.out.print(input[j][i]+" ");
              }

   
        }
        
      }

	}

	
}
