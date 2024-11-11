package interview;

import java.util.Scanner;

public class MatrixMultiplicaion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the row for A");
		int row1 =sc.nextInt();
		System.out.println("Enter the col for B");
		 int col1=sc.nextInt();
		 int a[][]=new int [row1][col1];
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[0].length;j++) {
				 System.out.println("Enter the nmu for"+i+" "+j);
				 
				 a[i][j]=sc.nextInt();
			 }
		 }for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[0].length;j++) {
				 System.out.print(a[i][j]);
			 }
			 System.out.println();
		 }
		 System.out.println("Enter the row for B");
			int row2 =sc.nextInt();
			System.out.println("Enter the col for B");
			 int col2=sc.nextInt();
			 int b[][]=new int [row1][col1];
			 for(int i=0;i<b.length;i++) {
				 for(int j=0;j<b[0].length;j++) {
					 System.out.println("Enter the nmu for"+i+" "+j);
					 
					 b[i][j]=sc.nextInt();
				 }
			 }for(int i=0;i<b.length;i++) {
				 for(int j=0;j<b[0].length;j++) {
					 System.out.print(b[i][j]);
				 }
				 System.out.println();
			 }
		 
		 
		 
		 
		 
		 
		/*for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
			
		}*/
		int c[][]=new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				for (int k=0;k<a.length;k++) {
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();}
			}
		
		

	}


