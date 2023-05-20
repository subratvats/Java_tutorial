package exception_multithreading;
//try with resources statement is s try stastement which declares one or more resourses
//try with resources statement ensures that each resourses is closed at the end of the statememnt
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class _6TryWithResource {
	static FileInputStream fi;
	static void Divide() throws IOException
	{
//		fi = new FileInputStream("C:\\Users\\subra\\Desktop\\JAVA\\trywithresources.txt");
//		Scanner sc=new Scanner(fi);
//		int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        System.out.println(a/c);
//        fi.close();
		 try(FileInputStream fi=new FileInputStream("C:\\Users\\subra\\Desktop\\JAVA\\trywithresources.txt");Scanner sc=new Scanner(fi) )
	        {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        System.out.println(a/c);
	        }
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
			Divide();
		}
		catch(Exception e)
        {
            System.out.println(e);
        }
		//int x=sc.nextInt();
        
	       // System.out.println(x);
	}

}
