package java_generics;

/*
class Data<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
public class _2GenricClass {

	public static void main(String[] args) {
		
		Data<Integer> d=new Data<>();
		d.setObj(10);
//		d.setObj("hi");//error at compile time only
		System.out.println(d.getObj());
	}

}
*/

class MyArray<T>{
	
//	T A[]=new T[10];//we can't create array of type generic so first create with object type and then typecast it
	
	T A[]=(T[])new Object[10];
	
	int length=0;
	public void append(T app)
	{
		A[length++]=app;
	}
	
	public void display() {
		for (int i=0;i<length;i++) {
			System.out.println(A[i]);
		}
	}

}
public class _2GenricClass {
	public static void main(String[] args) {
		MyArray<Integer> ma=new MyArray<>();
		ma.append(10);
		ma.append(20);
		ma.append(30);
		ma.append(40);
		ma.display();
	}

}