package innerclass;
//Annonymous inner class can be defined at the time of creaton of object itself
//it is useful for interfaces and abstract class
//for anonymous inner class, we use exactly one class or interface name and write its body

abstract class My{
abstract public void show();
}

//interface  My{
// public void show();
//}

class Out{
	int x =50;
	public void display() {

		My m =new My() {
			
			@Override
			public void show() {
				System.out.println("Annonymous inner class "+ x);
			}
		};
		m.show();
	}
}

public class _3AnnonymousClass {

	public static void main(String[] args) {
		Out o = new Out();
		o.display();
	}

}
