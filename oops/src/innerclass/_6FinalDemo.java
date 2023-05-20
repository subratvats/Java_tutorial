package innerclass;

//Values of final variables are fixed, once the value is assigned then it 
//can’t be modiLied. 
//• Final variables are written in capital letters. 

//• Final variable can be initialised while declaring the variable, or it can 
//be initialised in a static block, or else it can be initialised inside 
//constructor of a class. 

//• As constructors can be overloaded then the final variable must be 
//initialised in every constructor. 
//• Final method cannot be overridden. 
//• A Final class cannot be extended.  

/*

final class Test2 {
    public final void show()
    {
        System.out.println("hello");
    }
}

class Test1 extends Test2 ///final class can't be extended
{
//    public void show(){}
//    gives error as final methods cannot be overriden.
}
*/
public class _6FinalDemo {

      final float P;
//     static
//     {
//     P=3.14f;
//     }
     public _6FinalDemo(){
    	 P=3.145f;
     }
//    public static void FinalDemo()
//    {
//        PI=3.1425f;
//    }
    
    public static void main(String[] args) {
        
    	final int x=10;
    	System.out.println(x);
//        final float PI;
//        PI=3.1425f;
//        System.out.println(PI);
//    	System.out.println(P);
    }
    
}