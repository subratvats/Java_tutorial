package file_handling;
//here I have a student class and  want to store the object of student class in
//a file.And again, they want to retrieve it or retrieve down that object.
//this is a done using object input stream an object output stream.
//•	A class must implement the Serializable interface before its objects can be serialized.
//•	The ObjectOutputStream.writeObject() method serializes objects, and the 
//ObjectInputStream.readObject() method deserializes objects.

import java.io.*;

class Studentss implements Serializable //A class must implement the Serializable interface before its objects can be serialized. It does not have any method so no need to override
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10; //static and transient menber will not serialize
    public transient int t;
    
    public Studentss()  //this class must have  a default constructor eveen we dont write we have it
    {
        
    }
    
    public Studentss(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    public String toString()
    {
        return "\nStudentss Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

public class _9SerializationFinal {

	public static void main(String[] args) throws Exception{

		 //writing in a file
//		FileOutputStream fos=new FileOutputStream("C:/Users/subra/Desktop/JAVA/Object2.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        
//        Studentss s=new Studentss(10,"John",89.9f,"CSE");
//        
//        oos.writeObject(s);
//        
//        fos.close();
//        oos.close();
		
		
		
		FileInputStream fis=new FileInputStream("C:/Users/subra/Desktop/JAVA/Object2.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Studentss s=(Studentss)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
		
		
		
	}

}
