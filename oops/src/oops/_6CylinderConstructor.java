package oops;
class CylinderConstructor{
	private int radius;
    private int height;
	public CylinderConstructor(int radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	public CylinderConstructor() {
		super();
		this.radius = this.height =1;
	}
	public int getRadius() {
		return radius;
	}
	public int getHeight() {
		return height;
	}
	public void setRadius(int radius) {
		if (radius>0) {
			this.radius = radius;
			
		} else {
			this.radius = 0;
		}
	}
	public void setHeight(int height) {
		if (height>0) {
			this.height = height;
			
		} else {
			this.height = 0;
		}
		
	}
	
	public void setDimensions(int h,int r)
    {
        height=h;
        radius=r;
    }
	
	public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}


public class _6CylinderConstructor {

	public static void main(String[] args) {
		CylinderConstructor c=new CylinderConstructor();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 5);
        
        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());
	}

} 
