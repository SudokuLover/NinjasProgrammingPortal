public class solution {

	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here

      char ch=input.charAt(0);
      String str=""+ch;
     
      int n=input.length();
      for(int i=0;i<n;i++)
      {
        char ch1=input.charAt(i);
        if(ch!=ch1)
        {
          str+=ch1;
          ch=ch1;
        }
      }
      return str;
	}
}
