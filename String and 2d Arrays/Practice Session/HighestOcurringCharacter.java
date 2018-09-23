// highest occurring character in the String.
public class solution {

	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
    
      int arr[]=new int[26];
      
      for(int i=0;i<inputString.length();i++)
      {
        int k = inputString.charAt(i)-97;
        arr[k]++;
      }
      int k=arr[0];
      int j=0;
      for(int i=1;i<26;i++)
      {
        if(k<arr[i])
        {
        	k=arr[i];
          	j=i;
        }
        if(k==arr[i])
        {
          int o=check(inputString,(char)(i+97));
          int p=check(inputString,(char)(j+97));
        	
          if(o<p)
            j=i;
            
        }
      }
      
      return (char)(j+97);
    }
  
  public static int check(String str,char k)
  {
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)==k)
        return i;
    }
    return -1;
  }
}
