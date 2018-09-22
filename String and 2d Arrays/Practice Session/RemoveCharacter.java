public class solution {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here

      String str="";
      for(int i=0;i<input.length();i++)
      {
        char ch=input.charAt(i);
        if(ch!=c)
          str+=ch;
      }
      return str;
	}

}
