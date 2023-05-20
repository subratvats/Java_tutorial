package lamda_expression;
//can L.E have local variable --yes
//can they capture local varaible and instance variable --yes but some case
//can we pass LE as parameters

@FunctionalInterface  //if Interface has only one method
interface MyLambda3
{
	public void display(); //in Interface method by default public and abstract
} 

class Demo{
	int temp =10;  //this nedd not to be final
	
	public void method1() {
		
		int count =0; //LE can use this varibale inside LE but its value cant change(effectively final) or it can be made final
//		count=3;
		//only those varable to be final which is local to the method where LE is defined
		MyLambda3 m =()->
		{	
//			int count =0;
//			count=3;
			System.out.println("Hi "+count);
			System.out.println("Bye "+(++temp));
		};
	}
}


public class LamdaDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
