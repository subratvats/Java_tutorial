package file_handling;
//here we are storing object of class in a file and read it also 
//1. we write in string format and read in string format(PrintStream)
//2. we want to write in their own datatype and read same(DataInput and output stream)
//3.

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class Student
{
    int rollno;
    String name;
    String dept;
}

public class _9SerialisationDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//as we will already having data in the file below is code to do it 
//		FileOutputStream fos=new FileOutputStream("C:/Users/subra/Desktop/JAVA/Object.txt");
//        PrintStream ps=new PrintStream(fos);
//        
//        
//        Student s=new Student();
//        s.rollno=10;
//        s.name="John";
//        s.dept="CSE";
//        
//        ps.println(s.rollno);
//        ps.println(s.name);
//        ps.println(s.dept);
//        
//        ps.close();
//        fos.close();
		
		//code to read data from file
		FileInputStream fis=new FileInputStream("C:/Users/subra/Desktop/JAVA/Object.txt");//as it read oneone byte
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));//to read one line buffer reader and to
		//convert the inputstream to reader we used inputstream reader
		
        
        Student s=new Student();
        s.rollno=Integer.parseInt(br.readLine());//conversion happening here can be solved using Datai/p,o/p stream
        s.name=br.readLine();
        s.dept=br.readLine();
        
        System.out.println("Roll No "+s.rollno);
        System.out.println("Name "+s.name);
        System.out.println("Dept "+s.dept);
        br.close();
        fis.close();

	}

}
