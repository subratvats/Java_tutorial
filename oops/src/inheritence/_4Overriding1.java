package inheritence;

class Tv {
	public void switchOn() {
		System.out.println("Tv is switched ON");
	}

	public void changeChannel() {
		System.out.println("Tv channel is changed");
	}
}

class SmartTV extends Tv {
	@Override
	public void switchOn() {
		System.out.println("smartTv is switched ON");
	}

	@Override
	public void changeChannel() {
		System.out.println("smartTv channel is changed");
	}

	public void browse() {
		System.out.println("browsing channel");
	}
	
}

public class _4Overriding1 {

	public static void main(String[] args) {

		Tv stv = new Tv();
		stv.switchOn();
		stv.changeChannel();
	
		
		SmartTV smt =new SmartTV(); //method of super classwill also print if any
		smt.switchOn();
		smt.changeChannel();
		smt.browse();
		
		
		Tv t = new SmartTV();//can only call method present in super class 
							//but method are call depending on the object
		t.switchOn();
		t.changeChannel();
//		t.browse(); //this we can't do as it is  dynamic dispatch so comment it
		//return type must be same otherwise its niether overriden or overloaded
//polymorphism achieved in both overriding(runtime and achieved in inheritence)
//or overloading(compile time achieved in same class)
	}

}
