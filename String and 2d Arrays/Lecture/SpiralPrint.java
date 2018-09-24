public class solution {

	public static void spiralPrint(int matrix[][]){
		// Write your code here
      int row=0;
      int col=0;
      int rows=matrix.length-1;
      int cols=matrix[0].length-1;
      
      int n = (rows+1)*(cols+1);
      int l=0;
      
      //as i have pinted my all element then just come out from loop
      
      while(l<n)
      {
        if(l<n)
        {
            for(int i=col;i<=cols;i++)
          {
            l++;
            System.out.print(matrix[row][i]+" ");
          }
        }
        row++;
        
        if(l<n)
        {
          for(int i=row;i<=rows;i++)
          {
            l++;
            System.out.print(matrix[i][cols]+" ");
          }
        }
         cols--;
        
        
        if(l<n)
        {
          for(int i=cols;i>=col;i--)
          {
            l++;
            System.out.print(matrix[rows][i]+" ");
          }
        }
         rows--;
        
        
        if(l<n)
        {
          for(int i=rows;i>=row;i--)
          {
            l++;
            System.out.print(matrix[i][col]+" ");
          }
        }
        
         col++;
        
        
        
      }
      

	}
}