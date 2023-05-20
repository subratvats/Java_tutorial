package innerclass;
// Inner class can access the member of outer class directly and 
//outer class cannot access the member of outer class directly 
//unless it has created an object and use the member of inner class.
class Outer{
	static int x=10;
	class  Inner{
		int y=20;
		public void innerDisplay() {
			System.out.println(x+" "+y);
		}
	}
	public void outerDisplay() {
		Inner i = new Inner();
		i.innerDisplay();
		System.out.println(i.y);
	}
}
public class _1InnerClass {

	public static void main(String[] args) {
		
		Outer o =new Outer();
		o.outerDisplay();
		System.out.println(Outer.x);//static member can be accessed using claas name and dot
		
		//below is to access inner class whichh is not used that much but this is the way to do it
		Outer.Inner oi = new Outer().new Inner();
		oi.innerDisplay();
		System.out.println(oi.y);
	}

}
