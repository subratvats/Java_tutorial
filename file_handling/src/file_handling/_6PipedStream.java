package file_handling;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
	OutputStream os;
	public Producer(OutputStream o) {
		os =o;
	}
	
	public void run() {
		int count=1;
		while(true) {
			try {
				os.write(count);
				os.flush();
				System.out.println("Producer "+ count);
				System.out.flush();
				count++;
				Thread.sleep(10);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class Consumer extends Thread{
	InputStream is;
	public Consumer(InputStream in) {
		is =in;
	}
	
	public void run() {
		int x;   
		while(true) {
			try {
				x=is.read();
				System.out.println("Consumer "+ x);
				System.out.flush();
				Thread.sleep(10);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
public class _6PipedStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 PipedInputStream pis = new PipedInputStream();
		 PipedOutputStream pos=new PipedOutputStream();
		 
		 pis.connect(pos);
		 
		 Producer p = new Producer(pos);
		 Consumer c= new Consumer(pis);
		 
		 p.start();
		 c.start();
		 

	}

}













