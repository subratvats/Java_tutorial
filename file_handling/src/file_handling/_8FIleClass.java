package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _8FIleClass {

	public static void main(String[] args) throws IOException {
		
		File f =new File("C:/Users/subra/Desktop/JAVA");
		System.out.println(f.isDirectory());
		
//		String list[] = f.list();
//		for (String x : list) {
//			System.out.println(x);
//		}
		
		
		File list[] = f.listFiles();
		for (File x : list) {
			System.out.print(x.getName()+ " ");
			System.out.println(x.getPath());
		}
		 
		
		File f2 =new File("C:/Users/subra/Desktop/JAVA/Test.txt");
		f2.setReadOnly();
		FileOutputStream fos=new FileOutputStream("C:/Users/subra/Desktop/JAVA/Test.txt");
		fos.close();
	}

}
