package collection_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//its obselete will not use 
public class _6HashTable_properties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
			
Properties p=new Properties();
        
//        p.setProperty("Brand", "Dell");
//        p.setProperty("Processor", "i7");
//        p.setProperty("OS", "Windows10");
//        p.setProperty("Model", "Latitude");
        
        
//        p.storeToXML(new FileOutputStream("C:/Users/subra/Desktop/JAVA/MyData.xml"), "Laptop");
//        p.store(new FileOutputStream("C:/Users/subra/Desktop/JAVA/MyData1.txt"), "Laptop");
        p.load(new FileInputStream("C:/Users/subra/Desktop/JAVA/Mydata1.txt"));
//        p.loadFromXML(new FileInputStream("C:/Users/subra/Desktop/JAVA/MyData.xml"));
//        
        System.out.println(p.getProperty("OS"));
	
//		Hashtable<Integer,String> ht=new Hashtable<>();
//
//		ht.put(1,"A");
//		ht.put(2,"B");
//		ht.put(3,"C");
//		ht.put(4,"D");
//		ht.put(5,"E");
//
//
//		Enumeration e=ht.elements();
//		while(e.hasMoreElements())
//		{
//			System.out.println(e.nextElement());
//		}
//
//		ht.computeIfAbsent(7, (k)->"Z"+k);
//
//		System.out.println(ht);


	}

}
