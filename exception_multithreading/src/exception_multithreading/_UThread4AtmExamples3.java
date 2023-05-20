package exception_multithreading;

class Atm{
	
	synchronized public void checkBalance(String name)
    {
       System.out.print(name + " Checking ");
       
//       try{Thread.sleep(1000);}catch(Exception e){}
       
       System.out.println("Balance");
    }
    
    synchronized public void withdraw(String name,int amount)
    {
        System.out.print(name + " withdrawing "); 
        
//        try{Thread.sleep(1000);}catch(Exception e){}
        
        System.out.println(amount);
        
    }
}


class Customer extends Thread{
	String name;
	int amount;
	Atm atm;
	public Customer(String n,Atm a,int amt) {
		this.name=n;
		this.atm =a;
		this.amount=amt;
		
	}
	public void useAtm() {
		atm.checkBalance(name);
		atm.withdraw(name , amount);
	}
	public void run() {
		useAtm();
	}
	
}

public class _UThread4AtmExamples3{

	public static void main(String[] args) {
		Atm atm =new Atm();
		Customer c1 =new Customer("subrat",atm, 100);
		Customer c2 =new Customer("rahul",atm, 1000);
		c1.start();
		c2.start();
		
	}

}
