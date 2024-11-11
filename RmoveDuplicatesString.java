package interview;

import java.util.Scanner;

public class RmoveDuplicatesString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ENter the string");
		String x=sc.nextLine();
	StringBuilder sb = new StringBuilder(x);
	int length=sb.length();
	for(int i=0;i<length;i++) {
		for (int j=i+1;j<length;j++) {
			char c1=sb.charAt(i);
			char c2=sb.charAt(j);
			{
				if(c1==c2) {
					sb.deleteCharAt(i);
					i=0;j=0;
					length =length-1;
					
				}
			}
		}
		
		
	}
	System.out.println( sb);
	}

}
