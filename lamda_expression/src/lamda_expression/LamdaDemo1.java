package lamda_expression;

@FunctionalInterface  //if Interface has only one method
interface MyLambda
{
	public void display(); //in Interface method by default public and abstract
}

//class My implements MyLambda{
//	
//	@Override
//	public void display() {
//		System.out.println("Hello world!");
//	} 
//}

public class LamdaDemo1 {

	public static void main(String[] args) {
		//		My m =new My();
		//		m.display(); 

		//		MyLambda m =new My();
		//		m.display();

		MyLambda m = new MyLambda() { //annonymous inner class
			@Override
			public void display() {
				System.out.println("Hello world!");
			}
		};
		m.display();
		//in lambda expression dont need to give name of the method
		//remove interface class name also
		//to make a functional interface, easy for implementation.
		//Java has introduced this concept and this lambda expressions to override
		//functional interface
		//public void display() is replaced with ()->
		MyLambda m1 = 
			()->
		{
			System.out.println("hello");
		};
		m1.display();

	}

}
