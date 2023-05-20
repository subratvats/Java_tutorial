 package file_handling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class _5BuffredInputStream {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis =new FileInputStream("C:/Users/subra/Desktop/JAVA/Test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		
//		 int x;
//		 while ((x=bis.read())!=-1) {
//			System.out.print((char)x);
//		}
		 System.out.println();
		 System.out.println("File "+fis.markSupported());
		 System.out.println("Buffer "+bis.markSupported());
		
		 System.out.println((char)bis.read());
		 System.out.println((char)bis.read());
		 System.out.println((char)bis.read());
		 System.out.println((char)bis.read());
		 bis.mark(0); //0 means setting mark and as it is printing again means
//		 buffer is holding the data
		 System.out.println((char)bis.read());
		 System.out.println((char)bis.read());
		 System.out.println((char)bis.read());
		 bis.reset();
		 System.out.println((char)bis.read());
		 System.out.println((char)bis.read());
		 System.out.println((char)bis.read());
		 System.out.println((char)bis.read());

		bis.close();
	}

}
