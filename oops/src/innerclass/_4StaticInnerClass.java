package innerclass;
//in static context we can only access static member
//non static method ccan access both in a class
//only inner class can be made static
//static member are shared accross all the object and all object have their own 
//non-static member
//static method can access only static member
//static member/method can be accessed just by using class name
//static membe of a class is created in method area

class Outer1{
	int x=10;
	static int y=20;
	
	static class MyInner{
		public void show() {
			System.out.println(y);
		}
	}
}
public class _4StaticInnerClass {

	public static void main(String[] args) {
		Outer1.MyInner m =new Outer1.MyInner();
		m.show();
	}

}
