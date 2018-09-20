import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int start = sc.nextInt();
		 int end = sc.nextInt();
		 int gap = sc.nextInt();
			
		 for(int i=start;i<=end;i+=gap)
		 {
			 int k=5*(i-32)/9;
			 System.out.println(i+"\t"+k);
		 }
		
	}

}
