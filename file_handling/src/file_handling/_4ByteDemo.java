package file_handling;

import java.io.ByteArrayInputStream;


public class _4ByteDemo {

	public static void main(String[] args) throws Exception{
		
		byte b[]= {'a','b','c','d','e','f','g','h','i','j'};
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		
//		int x;
//		while((x=bis.read())!=-1)
//			System.out.println((char)x);
		
		String str =new String(bis.readAllBytes());//read all byte and convert into string
		System.out.println(str);
		
		System.out.println(bis.markSupported()); //will learn to use in next class
		
		bis.close();
	}

}
