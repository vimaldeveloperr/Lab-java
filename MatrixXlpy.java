package lab1;

import java.util.Scanner;

public class MatrixXlpy {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		  System.out.println("Enter the row1");
		  int row1=sc.nextInt();
		  System.out.println("Enter the col1");
		  int col1=sc.nextInt();
		  
		  System.out.println("Enter the row2");
		  int row2=sc.nextInt();
		  System.out.println("Enter the col2");
		  int col2=sc.nextInt();
		  if(col2!=row1) {
			  System.out.println("it is not posible");
			  return;
		  }
		  
		  
		  
		  int[][] m1=new int[row1][col1];
		  int[][] m2=new int[row2][col2];
		  int[][] result=new int[row1][col2];
		  
		  
		  System.out.println("Enter The 1st matrix");
		  for(int i=0;i<row1;i++) {
			  for (int j=0;j<col1;j++) {
				  m1[i][j]=sc.nextInt();
			  
		  }
		  
	}
		  System.out.println("Enter The 2nd matrix");
		  for(int i=0;i<row2;i++) {
			  for (int j=0;j<col2;j++) {
				  m2[i][j]=sc.nextInt();
			  
		  }
		  
	}
		  System.out.println("The final matrix");
		  for(int i=0;i<row1;i++) {
			  for (int j=0;j<col2;j++) {
				  result[i][j]=0;
				  for(int k=0;k<col1;k++) {
					  result[i][j]+=m1[i][j]+m2[k][j];
					  System.out.print(result[i][j]+" ");
					  
				  }
				  System.out.println();
					  
			  
		  }
		  
	}


		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  

	}

}
