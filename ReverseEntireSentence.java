package interview;

public class ReverseEntireSentence {

	public static void main(String[] args) {
		String str="hi bro How Are u";
		String word[]=str.split(" ");
		String ans="";
		for(int i =word.length-1;i>=0;i--) {
			ans =ans+word[i]+" ";
			
		}
		System.out.println(ans.substring(0 ,ans.length()-1));
		
		

	}

}
