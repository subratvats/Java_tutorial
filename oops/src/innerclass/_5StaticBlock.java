package innerclass;
//static block is used to load 
//Set	of	statements	are	written	in	the	form	of	blocks	and	are	made static.	
//• It	is	used	to	initialise	static	data	member.	
//• It is executed before	the	main method	at	the	time of	class loading.	
class Test
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
    System.out.println("Block 2");
    }
}

public class _5StaticBlock {

    
    
   static
    {
        System.out.println("Block 1");
    }
    
    
    public static void main(String[] args) 
    {
        //Test t=new Test();
        System.out.println("Main");
        Test t=new Test();
    }
    
    static
    {
    System.out.println("Block 2");
    }
    
}