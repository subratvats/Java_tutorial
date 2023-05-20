package innerclass;


//Local Inner class
class Outers {
	public void display() { //this class is local to this method
		 class Inners {  //outside  this class method is not visible
			 public void show() {
				System.out.println("Hello");
			}
			}
			Inners i = new Inners();
			i.show();
//			  or
//			new Inners().show();

	}
}


public class _2LocalInnerClass {

	public static void main(String[] args) {
		Outers o = new Outers();
		o.display(); // this creating object of inner class and calling the method
		
	}

}
