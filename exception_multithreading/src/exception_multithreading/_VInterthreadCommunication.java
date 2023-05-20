package exception_multithreading;

class MyData1{
	int value;
	boolean flag=false;
	synchronized public void set(int v)
	{
		while(flag!=true) {
			try {wait();} catch (Exception e) {}
		}
		value =v;
		flag=false;
		notify();
	}
	synchronized public int get()
	{
		int x=0;
		while(flag!=false) {
			try {wait();} catch (Exception e) {}
		}
		x=value;
		flag=true;
		notify();
		return x;
	}
}

class Producer extends Thread{
	MyData1 data;
	
	public Producer(MyData1 d) {
		this.data=d;
	}
	
	public void run() {
		int count =1;
		while (true) {
			data.set(count);
			System.out.println("Producer "+count);
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	MyData1 data;
	
	public Consumer(MyData1 d) {
		this.data=d;
	}
	
	public void run() {
		int value;
		while (true) {
			value = data.get();
			System.out.println("consumer "+value);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class _VInterthreadCommunication {

	
	public static void main(String[] args) {
		MyData1 data = new MyData1();
		Producer p =new Producer(data);
		Consumer c = new Consumer(data);
		p.start();
		c.start();
		
		
	}

}
