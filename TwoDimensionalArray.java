package interview;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
	//int a[][]={  {1,2,3},
		//	{4,5,6},
			///{7,8,9} ,
			//};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		int row= sc.nextInt();
		System.out.println("Enter the column");
	int col= sc.nextInt();
	int a[][]=new int[row][col];
	
	for (int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.println("Enter the  row and col of "+i+" ,"+j+" is");
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the next row");
	int row1= sc.nextInt();
	System.out.println("Enter the  next column");
int col1= sc.nextInt();
int a1[][]=new int[row1][col1];

for (int i=0;i<a1.length;i++) {
	for(int j=0;j<a1[i].length;j++) {
		System.out.println("Enter the  row and col of "+i+" ,"+j+" is");
		a1[i][j]=sc.nextInt();
	}
}
System.out.println("The A matrix is");	
	for(int i=0;i<a.length;i++ ) {
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
			}
	System.out.println();
		}

	


System.out.println("The B matrix is");	
for(int i=0;i<a1.length;i++ ) {
	for(int j=0;j<a1[0 ].length;j++)
	{
		System.out.print(a1[i][j]+" ");
		}
System.out.println();
	}
System.out.println("ADD two MATRIX"); 
int c[][]=new int [row][col];

if(row==row1 && col==col1) {

for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		c[i][j]=a[i][j]+a1[i][j];
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
}
else {
	System.out.println("Enter valid Matrix");
}
















}

}

