public class Solution {

	// Return the reversed string. No need to print
	public static String reverseEachWord(String str) {
		// Write your code here

      int i=0;
      String main="";
      int n=str.length();
      for(int k=0;k<n;k++)
      {
        if(str.charAt(k)==' ')
        {
          main+=reverse(str,i,k-1);
          main+=" ";
          i=k+1;
        }
      }
      main+=reverse(str,i,n-1);
      return main;
	}
  
  public static String reverse(String str,int i,int j){
    
    String str1="";
    
    for(int k=j;k>=i;k--)
    {
      str1+=str.charAt(k);
    }
    return str1;
  }
}
