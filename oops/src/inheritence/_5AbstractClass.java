package inheritence;
//object of abstract class can't be created
//abstract class and method can neither be final nor static otherwise 
//won't be able to extend and override
abstract class Parent{
	public Parent() {
		System.out.println("super constructor");
	}
	public void meth1()
	{
		System.out.println("Meth1 of super");
	}
	public abstract  void meth2();
}
 
 class Child extends Parent {
	 
	 @Override
	 public void meth2() {
		 System.out.println("child meth2");
		 
	 }
	 
 }

public class _5AbstractClass {

	public static void main(String[] args) {
		Parent s = new Child();// contructer will be cslled here
		
		s.meth1();
		s.meth2();
	}

}
