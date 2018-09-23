
public class Solution {

	
	public static void findLargest(int arr[][]){
		
		/* Your class should be named Solution.
		* Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/

      int result=0;
      int k=0;
      String p="row";
    		for(int i=0;i<arr.length;i++)
            {	int sum=0;
                for(int j=0;j<arr[i].length;j++)
                {
                    sum+=arr[i][j];
                }
               if(result<sum)
               {
                 result=sum;
                 k=i;
               }
            }
    		for(int i=0;i<arr[0].length;i++)
              //refer to coulomn as it has NxM matrix
            {	int sum=0;
                for(int j=0;j<arr.length;j++)
                {
                    sum+=arr[j][i];
                }
               if(result<sum)
               {
                 result=sum;
                 k=i;
                 p="column";
               }
            }
      System.out.println(p+" "+k+" "+result);
	}

	
}
