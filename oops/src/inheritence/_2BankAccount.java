package inheritence;

class NegativeDimentionException extends Exception{ //it must extend from super class when writing own excception
	public  String toString(){
		return "Enter valid amount to withdraw ";		
	}
}

class Account{
	 	private String accNo;
	    private String name;
	    private String address;
	    private String phno;
	    private String dob;
	    protected long balance;
		public Account(String accNo, String name, String address, String phno, String dob) {
			super();
			this.accNo = accNo;
			this.name = name;
			this.address = address;
			this.phno = phno;
			this.dob = dob;
			balance = 0;
		}
		public String getAccNo() {
			return accNo;
		}
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
		}
		public String getPhno() {
			return phno;
		}
		public String getDob() {
			return dob;
		}
		public long getBalance() {
			return balance;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setPhno(String phno) {
			this.phno = phno;
		}
		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", name=" + name + ", address=" + address + ", phno=" + phno + ", dob="
					+ dob + ", balance=" + balance + "]";
		}
}

class SavingsAccount extends Account
{
    public SavingsAccount(String accNo, String name, String address, String phno, String dob ,long balance) {
		super(accNo, name, address, phno, dob);// it will fetch value from super class
		this.balance = balance;
    }
	public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt) throws NegativeDimentionException
    {	
        if (balance-amt < 0) {
        	throw new NegativeDimentionException();
    	}
        balance-=amt;
        
        
    }
    
}



class LoanAccount extends Account
{
    public LoanAccount(String accNo, String name, String address, String phno, String dob) {
		super(accNo, name, address, phno, dob);
		
	}
	public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class _2BankAccount {

	public static void main(String[] args) //throws NegativeDimentionException 
	{
		SavingsAccount s1 =new SavingsAccount("1889484", "subat", "bhopal", "156818", "0105199",500);
		//SavingsAccount s2 =new SavingsAccount("2889484", "vats", "bjughopal", "7156818", "07105199",50);
		s1.deposit(100);
		try {
			s1.withdraw(400);
		} catch (NegativeDimentionException e) {
			System.out.println(e);
			
		}
		System.out.println(s1);
		System.out.println("your balance is "+s1.balance);
		//System.out.println(s2);
	}

}
