package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class _2FileExample {

	public static void main(String[] args) {
		try {
			try(FileInputStream fis =new FileInputStream("C:/Users/subra/Desktop/JAVA/Testing.txt"))
//			try(FileReader fis =new FileReader("C:/Users/subra/Desktop/JAVA/Test.txt"))
			{
				
//				byte b[]= new byte[fis.available()];//create byte array of size available
//				fis.read(b);		// read the byte into the array
//				String str =new String(b);  //convert the byte into string which is very important
//				System.out.println(str);
				
				
//				for (byte x : b) {
//					System.out.print((char)x);
//				}
				
				
				int x;
				do {
					x=fis.read();
					System.out.print((char)x);
				}while(x!=-1);  //-1 is when all byte in stream get completed
				
				
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}


