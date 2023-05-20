package java_lang_packages;

import java.lang.*;


class MyObject
{
    public String toString() //overriding tostring method
    {
        return "My Object";
    }
    
    public int hashCode()  //overriding
    {
        return 100;
    }
    public boolean equals(Object o)  //overriding equals method
    {
        return this.hashCode()==o.hashCode();
    }
//    public void notify() //cant override as its final method from object
//    {    }
}
public class _1JavaLangDemo {

	public static void main(String[] args) {
		MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        
        
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        
        System.out.println(o1.equals(o2));
        
	}

}
