package exception_multithreading;

class MyData {
synchronized  public void display(String str) {
//		synchronized (this) 
//		{
			//this block of code is called critical section as both thread using it
			//npow once a thread is completed then only other thread can run if syncronized
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
				try {Thread.sleep(100);}catch(Exception e) {}
			}
//		}
	}
}

class MyThread3 extends Thread{
	MyData d;
	public MyThread3(MyData d) {
		this.d=d;
	}
	
	public void run() {
		d.display("Hello world");
	}


}
class MyThread4 extends Thread{
	MyData d;
	public MyThread4(MyData d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.display("welcome all");
	}
}
public class _ThreadSynchronisation2 {

	public static void main(String[] args) {
		MyData data=new MyData();
		MyThread3 t3=new MyThread3(data);
        MyThread4 t4=new MyThread4(data);
        
        t3.start();
        t4.start();
	}

	

}
