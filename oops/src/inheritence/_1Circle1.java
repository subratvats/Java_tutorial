package inheritence;

class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public double circumference() {
		return perimeter();
	}
}

class Cylinder extends Circle{
private double height;
    
    public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

	public double volume()
    {
        return area()*height;
    }
}
public class _1Circle1 {
	public static void main(String[] args) {
		Cylinder c=new Cylinder();
        
        c.setRadius(7);
        c.setHeight(10);
        
        System.out.printf("Volume "+"%.2f\n",c.volume());
        System.out.printf("Area "+"%.2f\n",c.area());
       
	}
}
