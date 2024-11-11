package oopsconcept;
 abstract class pen{
	 abstract void rect();
	 void circle() {
		 System.out.println("its circle");
	 }
	
}
 class Pencil extends pen{
	 @Override
	 void rect(){
		 System.out.println("its rect");
	 
		 
	 }
	  
 }
public class Abstract {

	public static void main(String[] args) {
		Pencil p =new Pencil();
		//p.circle();
		p.rect();
		p.circle();
		
		


	}

}
