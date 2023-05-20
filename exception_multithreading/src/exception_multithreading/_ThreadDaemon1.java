package exception_multithreading;
//when main method is terminating then deamon thread is also terminating
//if we make main thread join other thread then it will wait for other thrhead to complete
class MyThread2 extends Thread{
	public void run() {
		int i=1;
		while (true) {
			System.out.println(i+" Hello");
			i++;
		}
	}
}
public class _ThreadDaemon1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread2 t = new MyThread2();
		t.setDaemon(true);//if true...and if main method is terminating then deamon thread is also terminating
		t.start();
//		try {
//			Thread.sleep(1); //for 1 ms thread will run
//		} catch (InterruptedException e) {
//			System.out.println(e); //i see its not able to come here also
//			e.printStackTrace();
//		}
		
//		Thread mainThread = Thread.currentThread();//we get the reference of main thread
//		mainThread.join();//it will join any thread whichever is running
		
		int i=1;
		while (i<10) {
			System.out.println(i+" main");
			i++;
			Thread.yield(); //this means it will give more cpu time(to execute) to another thread to complete
		}
	}

}
