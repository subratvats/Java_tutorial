package oops;
class RectangleContructor{
	private double length;
	private double breadth; 
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if (length>0) {
			this.length = length;
			
		} else {
			this.length =0;
		}
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		if (breadth>0) {
			this.breadth = breadth;
			
		} else {
			this.breadth =0;
		}
	}
	public double area() 
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	public boolean isSquare()
	{
		if (length==breadth) {
			return true;
		} else {
			return false;
		}
	}
	public RectangleContructor(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public RectangleContructor() {
		super();
		this.length = 1;
		this.breadth = 1;
	}
	public RectangleContructor(double side) {
		length=breadth=side;
	}

}
public class _5RectangleConstructor {
	public static void main(String[] args) {
		
		RectangleContructor r =new RectangleContructor();
		
		r.setBreadth(5);
		r.setLength(5);
		
		System.out.println("Length of Rectangle:"+r.getLength());
		System.out.println("Breadth of Rectangle:"+r.getBreadth());
		System.out.println("Area of Rectangle:"+r.area());
		System.out.println("Perimeter of Rectangle:"+r.perimeter());
		System.out.println("Is this a square: "+r.isSquare());
		
	
	}
}
