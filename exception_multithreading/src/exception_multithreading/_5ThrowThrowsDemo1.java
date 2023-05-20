package exception_multithreading;
//if throws exception then must be handeled
//we can write our own exception

class NegativeDimentionException extends Exception{ //it must extend from super class when writing own excception
//	public  String toString(){
//		return "Dimention can't be negative ";		
//	}
}

public class _5ThrowThrowsDemo1 {

	static int area(int l,int b) throws NegativeDimentionException 
	{
		if (l<0 || b<0) {
			throw new NegativeDimentionException();
		}
		return l*b;
	}
	static void meth1() throws NegativeDimentionException {
		area(5,6);
		
	}
	public static void main(String[] args) {
		
		try {
			System.out.println(area(-5,6));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Dimention can't be negative");
		}
	}

}
