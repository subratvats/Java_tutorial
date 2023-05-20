package file_handling;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class _1FileExample {

	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream fos =new FileOutputStream("C:/Users/subra/Desktop/JAVA/Testing.txt");
			String str="Learn Java Programmings";
			
//			fos.write(str.getBytes()); //we can use below method for same
			
			byte b[]=str.getBytes();
//			for (byte x : b) {
//				fos.write(x);
//			}
			
//			fos.write(b, 6, str.length()-6); //from 6th char to last
			
			fos.write(b);
			
			fos.close();
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}


//try with resource code for the same
//try(FileOutputStream fos =new FileOutputStream("C:/Users/subra/Desktop/JAVA/Test.txt");)
//{
//String str="Learn Java Programmings";
//		byte b[]=str.getBytes();
//		fos.write(b);
//}