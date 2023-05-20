package exception_multithreading;

public class _4ThrowThrowsDemo {
	static int meth1() {
		return 10/0;
	}
	static void meth2() {
		 meth1();
	}
	static void meth3() {
		 meth2();
	}
	public static void main(String[] args) {
		try {
			meth3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
