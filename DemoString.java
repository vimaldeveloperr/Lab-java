package interview;

public class DemoString {

	public static void main(String[] args) {
	String a= "Vimal";
	
	String b= "vimal";
	System.out.println(a.hashCode());
	System.out.println(a.equals(b));
	System.out.println(a.equalsIgnoreCase(b)+""+a.charAt(0));
	System.out.println(a.replace("al","raj"));
	System.out.println(a.replaceAll(a, b));
	
	
			

	}

}