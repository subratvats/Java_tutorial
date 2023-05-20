package inheritence;

class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{	
	@Override
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class _3Overriding {

	public static void main(String[] args) {
        Super sup=new Super();
        sup.display();
        Sub sub=new Sub();
        sub.display();
        //Dynamic Method Dispatch
//when a super class ref holding object of sub class and overriden method called 
        Super s = new Sub();
        s.display();
//        super class method can't be called upon the object of sub class
//        Sub sub1 = new Super();
        
	}

}
