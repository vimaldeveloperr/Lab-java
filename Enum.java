package oopsconcept;

public class Enum {
	enum game{
		LOW,
		HIGH,
		MED
	}

	public static void main(String[] args) {
      
		game g= game.HIGH;
		System.out.println(g);
		
		switch(g){
		case LOW:
			System.out.println("low");
			break;
		case HIGH:
			System.out.println("HIGH");
			break;
		case MED:
			System.out.println("MED");
			break;
			
			
		
	}
		for(game ga:game.values())
			
			System.out.println(ga);
		
	
	}}
