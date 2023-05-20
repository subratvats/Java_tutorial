package inheritence;
//Interface can be extended from another interface
interface Test
{
	//(Identifire/member is by default final and static)
    final static int X=10; //can use identifire but it must be uppercase
    //by default method are public and abstract
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3() //can have body if it made static
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test{
	void meth4();
}
class My implements Test2{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
    
}


public class _6Interface {

	public static void main(String[] args) {
		
//static member can be accessed in main() by using interface name and dot operator
		 System.out.println(Test.X);
		 Test.meth3();
		 								
	        Test t1 =new My();
	        t1.meth1();
	        t1.meth2();
	        
	        Test2 t = new My();
	        t.meth1();
	        t.meth2();
	        t.meth4();
	        
	        
	}

}
