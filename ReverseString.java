package interview;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String ");
		String str =sc.nextLine();
		String rev="";
		int len=str.length();
		for (int i =len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);

		
	
		StringBuilder sbl=new StringBuilder(str);
		System.out.println(sbl.reverse());
		
		
		if (str.equals(rev)) {
			System.out.println("plaindrome");
			
		}
		else
		{
			System.out.println("not");
		}
		
				
		
	}

}
