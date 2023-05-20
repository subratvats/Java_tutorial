package java_generics;
//No parameter : it will be of object class
//Multiple parameter : its used in key value pair
//Subtype : subclass also made generic if extending from superclass `
//Bounded type

class MyArray1<T extends Number>{  //bounding it to use only Number realated subclass 
	
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


class A<T>{
	
}
class B<T> extends A<T>{
	
}
class C extends A{}
public class _3BoundsonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray1<Integer> ma=new MyArray1<>();
		ma.append(10);
		ma.append(20);
		ma.append(30);
		ma.append(40);
		ma.display();
	}

}
