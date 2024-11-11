package oopsconcept;

class GetAndSet {
	 private int length,breadth;
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	int area() {
		int a=length*breadth;
		return a;
	}
	

	public static void main(String[] args) {
		GetAndSet obj =new GetAndSet();
		obj.setBreadth(20);
		
		obj.setLength(2);
		;
          int rev= obj.area();
           System.out.println(rev);
           System.out.println(obj.getBreadth());
	}

}
