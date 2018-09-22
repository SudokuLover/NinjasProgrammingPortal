
public class Solution {

	public static void printSubstrings(String str){
	
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question.
		*/

      int k=0;
      int n=str.length();
        for(int i=0;i<n;i++)
        {String str1="";
          for(int j=i+1;j<=n;j++)
          {
           	 str1=str.substring(i,j);
            
         	System.out.println(str1);
          }
      }
	}
	

}