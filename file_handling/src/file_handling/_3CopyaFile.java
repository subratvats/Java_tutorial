package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class _3CopyaFile {

	public static void main(String[] args) throws Exception{
		FileInputStream fis =new FileInputStream("C:/Users/subra/Desktop/JAVA/Test1.txt");
		FileInputStream fis2 =new FileInputStream("C:/Users/subra/Desktop/JAVA/Test2.txt");
		FileOutputStream fos =new FileOutputStream("C:/Users/subra/Desktop/JAVA/destination.txt");
		
		SequenceInputStream  sis =new SequenceInputStream(fis,fis2);
		
		int b;
		while((b=sis.read())!=-1)
		{
				fos.write(b);
		}
		fis.close();
		fis2.close();
		sis.close();
		fos.close();
			
		
	} 

}


//to copy all content from 1 file to ithre
//FileInputStream fis =new FileInputStream("C:/Users/subra/Desktop/JAVA/Test.txt");
//FileOutputStream fos =new FileOutputStream("C:/Users/subra/Desktop/JAVA/Test1.txt");
//
//
//int b;
//while((b=fis.read())!=-1)
//{
//	if(b>=65 && b<=120)
//		fos.write(b+32);
//	else
//		fos.write(b);
//		
//}
//fis.close();
//fos.close();