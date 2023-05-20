package java_generics;
//Conclusion from this demonstration.
//1. If you have a reference of an object, you can assign the object of any type, object of any class, string
//or integer.
//2. When you want to get it back in actual reference, you have to do typecasting 
public class _1GenericDemo<T> {

	T data[] = (T[]) new Object[3];
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
//		Object obj =new String("Hello");
//		obj =new Integer(10);
//		Integer str =(Integer)obj;
//		System.out.println(str);
		
		
//		Object obj []=new Object[3];
//		obj[0]="hi";
//		obj[1]="bye";
//		obj[2]=new Integer(10);  //here we get error at runtime to resoolve this we use generic
//		
//		for (Object x : obj) {
//			System.out.println((String)x); 
//		}
		
		//generic is typesafe mean only mentioned type can be used
		
		_1GenericDemo<String> gd=new _1GenericDemo<>();
		gd.data[0]="hi";
		gd.data[1]="bye";
//		gd.data[2]=10;
		
	}

}
