package collection_framework;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _7StringTokenizer {

	public static void main(String[] args) throws Exception{

		/*
		String prop="name=Vijay address=delhi country=india dept=cse";
		StringTokenizer prp=new StringTokenizer(prop," ");
		String t;
		while(prp.hasMoreTokens())
		{
			t=prp.nextToken();
			System.out.println(t);
			
		}
		*/

		
		// File path must be valid
        FileInputStream fis=new FileInputStream("C:/Users/subra/Desktop/JAVA/demo5.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        
        String data=new String(b);

        
        
        StringTokenizer stk=new StringTokenizer(data,",");
        
        String s;
        ArrayList<Integer> al=new ArrayList<>();
        
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(Integer.valueOf(s));
            
        }
        
        System.out.println(al);
        fis.close();
	}

}
