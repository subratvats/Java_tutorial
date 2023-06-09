package inheritence;

class Phone 
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
  void videoCall() { System.out.println("Smart Phone video calling"); }
   
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }

}

public class _7InterfacePractice {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.sms();
		sp.click();
		sp.record();
		sp.play();
		sp.stop();
		
		Phone ph =new Phone(); //only we ccan call which is present in phone class
		ph.call();
		ph.sms();
		
		ICamera ic =new SmartPhone();
		ic.click();
		ic.record();
		
		
		
		
	}

}
