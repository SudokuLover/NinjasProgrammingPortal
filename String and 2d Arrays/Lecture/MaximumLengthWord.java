
public class Solution {
	
	public static String minLengthWord(String input){
		int j=Integer.MAX_VALUE;
      	int start=0;
      	int end=0;
      String str="";
      int n=input.length();
      for(int i=0;i<n;i++)
      {
        if(input.charAt(i)==' ')
        {
          end=i-1;
          if(j>(end-start+1))
          {
            
            str=string(input,start,end);
            j=end-start+1;
           
          }
           start=i+1;
        }
      }
      
          if(j>(n-start))
          {    
            str=string(input,start,n-1);
          }
      
      
      return str;
	}
  public static String string(String str1,int i,int j){
    String str="";
    for(int k=i;k<=j;k++)
    {
      	str+=str1.charAt(k);
    
    }
      return str;
	}
}
