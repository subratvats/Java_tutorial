package lamda_expression;
//can we pass LE as parameters

@FunctionalInterface  //if Interface has only one method
interface MyLambda4
    {
	public void display(); 
	} 

class UseLambda{
	public void callLambda(MyLambda4 m) {
		m.display();
	}
}

class Demo1{
	public void method1() {
		UseLambda ul  =new UseLambda();
		ul.callLambda(()->{System.out.println("Hello");});
	}
}
public class LamdaDemo3_1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.method1();
	}

}
