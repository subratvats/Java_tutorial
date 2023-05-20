package exception_multithreading;
import java.util.Scanner;
//while writing catch 1st write sub class exception
//finally block execute at the end
public class _1ExceptionDemo {
	
	    static void meth1() throws Exception
	    {
	        try
	        {
	            
	        throw new Exception();
	        }
	        finally
	        {
	           //this message will definitly execute 
//	        	System.exit(0);
	        System.out.println("Final Message");
	        }
	        
	    }
	
	public static void main(String[] args) throws Exception{
//		    int a,b,c;
//	        Scanner sc=new Scanner(System.in);
//	        System.out.println("Eneter 2 numbers");
//	        a=sc.nextInt();
//	        b=sc.nextInt();
//	        
//	        try {
//				c=a/b;
//				System.out.println("Division is " +c);
//			} catch (ArithmeticException e) {
//				System.out.println("Denominator should not be 0, try again");
//				e.printStackTrace();
//				System.out.println(e.getMessage());
//				System.out.println(e.getCause());
//			}
//	        catch (Exception e) {
//				// TODO: handle exception
//			}
//			finally {
//				
//			}
//            
//            System.out.println("Bye");
            meth1();
	}
	
}


