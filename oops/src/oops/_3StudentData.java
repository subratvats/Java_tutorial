package oops;

class Student1{
	public int roll;
	public String name;
	public String courses;
	public int m1,m2,m3;
	
	public int total()
	{
		return m1+m2+m3;
	}
	public float avarage()
	{
		return (float)total()/3;
	}
	public char grade()
	{
		if (avarage()>=60) {
			return 'A';
		} else {
			return 'B';
		}
	}
	public String details()
	{
		return "ROll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+courses+"\n";
	}
	//Java - toString() Method
	//The method is used to get a String object representing 
	//the value of the Number Object and accesed using object name
	public String toString()
	{
		return "ROll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+courses+"\n";
	}
}
public class _3StudentData {

	public static void main(String[] args) {
		Student1 s =new Student1();
		s.roll=1;
		s.name="Subrat";
		s.courses="ECE";
		s.m1=70;
		s.m2=80;
		s.m3=90;
		
		System.out.println("Total Marks "+s.total());
		System.out.println("Avarage Marks "+s.avarage());
		System.out.println("Grade I got "+s.grade());
		System.out.println("Details of Student "+s.details());
		System.out.println("Details of Student "+s);
	}

}
