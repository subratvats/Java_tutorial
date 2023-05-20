package exception_multithreading;
//i think in nested try catch for first exception it will not enter in other better write multi try catch for this
public class _2NestedCatch {

	public static void main(String[] args) {

		int A[] = {20,5,8,5,4,0};
		try {
			int c = A[0]/A[5];
			System.out.println(c);
			
				try {
					System.out.println(A[7]);
					}

				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("invalid index, pls enter valid one! "+e);
				}
		}
		catch(ArithmeticException e)
		{
			System.out.println("devide by 0 try again!! "+e);
		}

		System.out.println("Bye");
	}

}
