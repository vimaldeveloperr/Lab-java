package interview;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
	String str=sc.nextLine();
		/*int org=n;
		int reverse=0,rem;
		while(n>0) {
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
			
			
		}
		System.out.println(reverse);
if(org==reverse) {
	System.out.println("palindrome");
}
else {
	System.out.println("not a palindrome");
}*/

StringBuffer rev;
StringBuffer sb= new StringBuffer(str);
rev=sb.reverse();
System.out.println(rev);
	}

}
