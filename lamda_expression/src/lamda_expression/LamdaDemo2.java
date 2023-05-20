package lamda_expression;
//parameteres in lambda expression

//@FunctionalInterface  //if Interface has only one method
//interface MyLambda2
//{
//	public void display(String str); //in Interface method by default public and abstract
//}
//public class LamdaDemo2 {
//
//	public static void main(String[] args) {
//		MyLambda2 m1 = 
//				(s)->
//			{
//				System.out.println(s);
//			};
//			m1.display("hellow");
//	}
//
//}


@FunctionalInterface  //if Interface has only one method
interface MyLambda2
{
	public int add(int a, int b); //in Interface method by default public and abstract
}
public class LamdaDemo2 {

	public static void main(String[] args) {
		MyLambda2 m1= (x,y)->x+y;  //we can add w/o return statement as lamda expresson
//			{
//				return x+y ;  //single statement with or without bracket we can write
//			};
			System.out.println(m1.add(5,6));
	}

}