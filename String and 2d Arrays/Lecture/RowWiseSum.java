import java.util.*;
public class Solution {

	public static void main(String[] args) {
		int [][]arr =takeInput();
		printArray(arr);
	}
	
	public static int[][] takeInput(){
		
		Scanner sc = new Scanner(System.in);

		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int [][]arr=new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		return arr;
	}
	
	public static void printArray(int [][]arr){

		for(int i=0;i<arr.length;i++)
		{	int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
            }
			System.out.print(sum+" ");
		}
	}

}
