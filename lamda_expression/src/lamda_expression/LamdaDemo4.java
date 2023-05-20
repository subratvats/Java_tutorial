package lamda_expression;

interface MyLambda5
{
	public void display(String str); 
} 

public class LamdaDemo4 {

	public static void main(String[] args) {
		MyLambda5 m1 =System.out::println;
		m1.display("hello");
	}

}
