public class Solution {

	public static String compress(String inputString) {
		// Write your code here
      
      int n=inputString.length();
      int k=1;
      String str="";
      char ch=inputString.charAt(0);
        
      for(int i=1;i<n;i++)
      {
        char ch1=inputString.charAt(i);
        if(ch==ch1)
          k++;
        else{
          if(k>1)
          {
            str+=ch;
              str+=k;
          
          }
          else{
          str+=ch;   
          }
          k=1;
          ch=ch1;
        }
      }

      if(k==1)
      {
        str+=ch;
      }
      else{
        str+=ch;
        str+=k;
        
      }
      
      return str;
	}

}
