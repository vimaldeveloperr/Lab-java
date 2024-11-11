package oopsconcept;
interface demo{
	int a=0;
	void fun1();
	void fun2(); 
	private void fun4() {
		System.out.println("fun4");
		
	}
	default void fun3() {
		System.out.println("fun3");
	}
}
class demo1 implements demo{

	@Override
	public void fun1() {
		System.out.println("fun1");
		
	}

	@Override
	public void fun2() {
		System.out.println("fun2");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
    demo1 d=new demo1();
    d.fun1();
    d.fun2();
    d.fun3();
    System.out.println(demo.a);
   

	}

}
