package file_handling;

import java.io.*;

class Students
{
    int rollno;
    String name;
    float avg;
    String dept;
}
public class _9SerializationDataInputOutStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        //writing in a file
//        FileOutputStream fos=new FileOutputStream("C:/Users/subra/Desktop/JAVA/Object1.txt");
//        DataOutputStream dos=new DataOutputStream(fos);
//        
//        Students s1=new Students();
//        s1.rollno=10;
//        s1.name="John";
//        s1.dept="CSE";
//        s1.avg=75.9f;
//        dos.writeInt(s1.rollno);//value in file is not readable binary file
//        dos.writeUTF(s1.name);
//        dos.writeUTF(s1.dept);
//        dos.writeFloat(s1.avg);
//        dos.close();
//        fos.close();
		
		
		 //reading from file
        FileInputStream fis=new FileInputStream("C:/Users/subra/Desktop/JAVA/Object1.txt");
        DataInputStream dis=new DataInputStream(fis);//only datainputstream can read if written usin dataoutput
        
        Students s=new Students();//order of retrieving should same as of input to the file
        
        s.rollno=dis.readInt();
        
        s.name=dis.readUTF();
        
        s.dept=dis.readUTF();
        s.avg=dis.readFloat();
        
        System.out.println("Roll no "+s.rollno);
        System.out.println("Name "+s.name);
        System.out.println("Average "+s.avg);
        System.out.println("Dept "+s.dept);
        
        
        dis.close();
        fis.close();
	}

}
