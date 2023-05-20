package file_handling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Customer implements Serializable{
	String custId;
	String name;
	String phno;
	static int count =1;
	
//	Customer(){
//		
//	}
	
	 Customer( String name, String phno) {
		
		custId = "C"+count;
		count++;
		this.name = name;
		this.phno = phno;
	}
	 
	 public String toString() {
		 return "Customer ID: "+custId+"\nName: "+name+"\nPhno: "+phno+"\n";
	 }
	
}

public class _9SerializationProblem {
/*
	public static void main(String[] args) throws Exception{
		
		float list[]={1.2f , 3.45f , 6.78f , 9.01f , 2.34f};
		FileOutputStream fos=new FileOutputStream("C:/Users/subra/Desktop/JAVA/Object3.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(list.length);
        for(float f:list)
        {
            dos.writeFloat(f);
        }
        
        dos.close();
        fos.close();
        
        FileInputStream fis=new FileInputStream("C:/Users/subra/Desktop/JAVA/Object3.txt");
        DataInputStream dis=new DataInputStream(fis);
        int length=dis.readInt();
        float data;
        
        for(int i=0;i<length;i++)
        {
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
       
       */ 
	
	
public static void main(String[] args) throws Exception{
		
//	Customer list[] = {new Customer("Smith","7896402564"),new Customer("John","7896402564"),new Customer("Jeff","7896402564")};
//		
//		FileOutputStream fos=new FileOutputStream("C:/Users/subra/Desktop/JAVA/Object4.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeInt(list.length);
//        for(Customer c:list)
//        {
//            oos.writeObject(c);
//        }
//        
//        oos.close();
//        fos.close();
        
        FileInputStream fis=new FileInputStream("C:/Users/subra/Desktop/JAVA/Object4.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        int length=ois.readInt();
        
        Customer list[] =new Customer[length];
        
        for (int i = 0; i < list.length; i++) {
			list[i]=(Customer)ois.readObject();
			System.out.println(list[i]);
		}
        ois.close();
        fis.close();
//       
		
	}

}
