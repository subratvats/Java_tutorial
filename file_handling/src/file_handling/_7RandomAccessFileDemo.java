package file_handling;

import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

public class _7RandomAccessFileDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		RandomAccessFile rf=new RandomAccessFile("C:/Users/subra/Desktop/JAVA/RandomAccessFile.txt","rw");
	       //{'A','B','C','D','E','F','G''H','I','J'};
	       
	        System.out.println((char)rf.read());//read and move the pointer forward
	        System.out.println((char)rf.read());
	        System.out.println((char)rf.read());
	        rf.write('d');//write and move the pointer forward
	        System.out.println((char)rf.read());
	        rf.skipBytes(3);
	        System.out.println((char)rf.read());
	        rf.seek(3);//it moves the pointer to 3rd index 
	        System.out.println((char)rf.read());
	        System.out.println((char)rf.read());
	        System.out.println(rf.getFilePointer());//find current index
	        rf.seek(rf.getFilePointer()+2);
	        System.out.println((char)rf.read());
	}

}
