package file_handling;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

public class _4ByteDemo2 {

	public static void main(String[] args)  throws Exception{
		
		
		//char array reader
//		char b[]= {'a','b','c','d','e','f','g','h','i','j'};
//		
//		CharArrayReader cr = new  CharArrayReader(b);
//		int x;
//		while((x=cr.read())!=-1) {
//			System.out.print((char)x+" ");
//		}
//		cr.close();
		
		CharArrayWriter cw =new CharArrayWriter();
		
		cw.write('a');
		cw.write('b');
		cw.write('c');
		cw.write('d');
		cw.write("subrat vats");
		
		
		FileWriter fw=new FileWriter("C:/Users/subra/Desktop/JAVA/demo5.txt"); // create object with reference
		cw.writeTo(fw);
//		In CharArrayWriter, array act as a buffer. file is not a buffer. writeTo is dumping 
//		the contents. it can be done in a Buffer.
		fw.flush(); // use flush
		
		char b[]= cw.toCharArray();		
		for (char x:b)
			System.out.println(x);
		
		
		cw.close();
		fw.close();
	}

}
