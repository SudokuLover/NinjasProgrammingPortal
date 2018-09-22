public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
      
      int n=input.length();
      int j=n-1;
      String str="";
      for(int i=n-1;i>=0;i--)
      {
        if(input.charAt(i)==' ')
        {
          str+= string(input,i+1,j);
          j=i-1;
          str+=" ";
        }
      }

          str+= string(input,0,j);
      return str;
      
	}
  public static String string(String str,int i,int j){
    String str1="";
    for(int k=i;k<=j;k++)
    {
      str1+=str.charAt(k);
    }
    return str1;
  }
}
