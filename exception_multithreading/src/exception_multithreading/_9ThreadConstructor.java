package exception_multithreading;
import java.lang.*;
import java.io.*;
class MyThread1 extends Thread{

	public MyThread1(String name) {
		super(name);  //we are using here string name from thread class in form of constructor
		setPriority(Thread.MAX_PRIORITY-2);//priority can be between 1 to 10
	}
	@Override
	public void run() {
		int i=1;
		while (i<10) {
			System.out.println(i+" Hello");
			i++;
			try {
				Thread.sleep(1000);  //this is checked exception
			} catch (InterruptedException e) {
				System.out.println(e);
//				e.printStackTrace();
			}
		}
	}

	
}

public class _9ThreadConstructor {

	public static void main(String[] args) throws Exception {
		MyThread1 t = new MyThread1("my thread 1");
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		System.out.println(t.isAlive());
		t.start();
		t.interrupt();//sleep will make a thread delay for a while and also 
					// interrupt will interupt any sleeping thread.And wake it up to continue its execution.
		int i=1;
		while (i<10) {
			System.out.println(i+" world");
			i++;
			
		}
	}

}
