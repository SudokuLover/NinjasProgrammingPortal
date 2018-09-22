
public class Solution {

	public static boolean checkPalindrome(String str){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
      int k=0;
	for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
				k=1;
              break;
            }
		}
		if(k==0)
			return true;
		else
			return false;
	
	}
}
