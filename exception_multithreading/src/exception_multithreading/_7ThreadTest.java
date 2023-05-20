package exception_multithreading;
//java provide thread class and runnable interface to achieve Multithreaeding

class MyThread extends Thread{
	public void run() {
		int i=1;
		while (i<10) {
			System.out.println(i+" Hello");
			i++;
		}
	}
}
public class _7ThreadTest {

	public static void main(String[] args) {
		MyThread t = new MyThread(); //object of thread class created in mainmethod
		t.start(); //this method calls the thread class and run the method which is built in method of thread class
		int i=1;
		while (i<10) {
			System.out.println(i+" world");
			i++;
			
		}
	}

}
