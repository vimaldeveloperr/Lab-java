package oopsconcept;
class Shape{
	 float length,breadth,radius;
	
}
class rect extends Shape{
	public rect(float l,float b) {
		length=l;
		breadth=b;
	}
	float rectanglearea() {
		return length* breadth;
		
	}
}
class circle extends Shape{
	public char[] areacircle;
	public circle(float r) {
		radius=r;
	}
	float areacircle() {
		return 3.14f*( radius*radius);
	}
}



public class HierachicalInheeritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect obj=new rect(2,3);
		System.out.println(obj.rectanglearea());
		circle obj1=new circle(3);
		System.out.println(obj1.areacircle);
		

	}

}
