package oops;

class Cylinder{
	
	public double radius;
	public double height;
	
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double totalSurfaceArea()
	{
		return 2*lidArea()+circumference()*height;
	}
	public double circumference()
	{
		return 2*Math.PI * radius;
	}
	public double volume()
	{
		return lidArea()*height;
	}
	
}
public class _2Cylinder1 {
	public static void main(String[] args) 
	{
		Cylinder c = new Cylinder();
		c.radius = 1;
		c.height = 5;
		
		System.out.printf("%.2f\n",c.lidArea());
		System.out.printf("%.2f\n",c.totalSurfaceArea());
		System.out.printf("%.2f\n",c.volume());
	}
}
