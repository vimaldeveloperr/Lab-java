package lab1;
class Shape{
	double area;
	//constructor for Recatangle
	Shape(double length,double breadth)
	{
		area=length*breadth;
	}
	//constructor for square
	Shape(double side)
	{
		area=side*side;
	}
	//constructor for circle
	Shape(double radius, boolean isCircle)
	{
		area =Math.PI*radius*radius;
		
	}
	//constructor for triangle
	Shape(double base,double height,boolean isTraingle)
	
	{
		area=0.5*base*height;
	}
	void displayArea() {
	System.out.println("Area"+area);
	}	
	
}

public class AreaCalculation {

	public static void main(String[] args) {
		Shape rectangle= new Shape(10,6);
		System.out.println("Rectangle:");
		rectangle.displayArea();
		
		Shape square=new Shape(8);
		System.out.println("square");
		square.displayArea();
		
		Shape circle=new Shape(3.4,true);
		System.out.println("circle");
		circle.displayArea();
		
		
		Shape triangle=new Shape(4,7,true);
		System.out.println("triangle");
		triangle.displayArea();	
		

	}

}
