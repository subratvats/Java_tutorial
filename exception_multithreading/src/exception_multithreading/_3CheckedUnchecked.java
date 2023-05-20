package exception_multithreading;
class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Balance Should not be less than 5000";
    }
}
public class _3CheckedUnchecked {
	static void fun1() {
		//unchecked
//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		//________________________________//
		try
        {
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
		
		
	}
	public static void main(String[] args) {
		fun1();
		
	}

}
