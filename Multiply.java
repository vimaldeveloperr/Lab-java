package oopsconcept;

class mul{
	String name;
	int age; 
	mul (String name,int age){
this.name=name;;
this.age =age;}
	
	public  void display() {
		System.out.println(name+" "+age);
	}
	
	
}
class lum extends mul{
String sex;
	lum(String name, int age,String c) {
		
		super(name, age);
		this.sex=c;
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println(name + " "+age+" "+sex);
	}
}
public class Multiply {
	
	public static void main(String[] args) {
		lum l=new lum("vimal",21,"male");
		l.display();
	}

}
