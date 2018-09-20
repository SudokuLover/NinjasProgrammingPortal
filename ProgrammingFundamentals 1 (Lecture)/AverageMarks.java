import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
      	char ch = sc.next().charAt(0);

      	int sum=0;
		
      	for(int i=0;i<3;i++)
		{
			int k=sc.nextInt();
			sum+=k;
		}
      	sum/=3;
      	System.out.println(ch);
      	System.out.println(sum);
	
		
	}

}
