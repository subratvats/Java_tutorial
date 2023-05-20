package file_handling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class _4ByteDemo1 {

	public static void main(String[] args) throws Exception{
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);//20 is its size
		
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');

		//--------//		

		byte b[]= bos.toByteArray();//Creates a newly allocated byte array. Its size is the current 
		//size of this output stream and the valid contents of the bufferhave been copied into it.
		//Returns:the current contents of this output stream, as a byte array.
		for (byte x:b)
			System.out.println((char)x);

		//--------//		
		bos.writeTo(new FileOutputStream("C:/Users/subra/Desktop/JAVA/demo4.txt"));
		
		bos.close();
	}

}
