package interview;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="hi bro How Are you";
		String word[]=str.split("\\s");
		String reversed="";
		for(String W:word) {
			StringBuilder sb =new StringBuilder(W);
			sb.reverse();
			reversed = reversed+sb.toString()+" ";
			 
			
			
		}System.out.println(reversed.trim());
		
	}

}
