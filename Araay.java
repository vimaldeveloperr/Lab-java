package lab1;
import java.util.Scanner;

public class Araay {
	public static void main(String args[]) {
		 Scanner sc =new Scanner(System.in);
		  System.out.println("Enter the row");
		  int row=sc.nextInt();
		  System.out.println("Enter the col");
		  int col=sc.nextInt();
		  
		  
		  int[][] m1=new int[row][col];
		  int[][] m2=new int[row][col];
		  int[][] add=new int[row][col];
		  
		  
		  //input for the 1st matrix
		  System.out.println("Enter The 1st matrix");
		  for(int i=0;i<row;i++) {
			  for (int j=0;j<col;j++) {
				  m1[i][j]=sc.nextInt();
			  
		  }
		  
	}
		  //input for the 2nd  matrix
		  System.out.println("Enter The 2nd matrix");
		  for(int i=0;i<row;i++) {
			  for (int j=0;j<col;j++) {
				  m2[i][j]=sc.nextInt();
			  
		  }
		  
	}
		  System.out.println(" The Final  matrix is ");
		  for(int i=0;i<row;i++) {
			  for (int j=0;j<col;j++) {
				 add[i][j]=m1[i][j]-m2[i][j];
				 
				 System.out.print(add[i][j]+" ");
			  
		  }
			  System.out.println();
			  
		  
	}
	}}
