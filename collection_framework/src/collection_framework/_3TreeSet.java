package collection_framework;

import java.util.List;
import java.util.TreeSet;

class Point implements Comparable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	

	@Override
	public String toString() {
		return " x=" + x + ", y=" + y ;
	}


	public int compareTo(Object o) {//here parameter type should be Object and the as this is signature
		
		Point p=(Point)o; //take reference of point and typecast object o to point
		if (this.x<p.x) {
			return -1;
		} else if(this.x>p.x) {
			return 1;
		}
		else {
			if (this.y<p.y) {
				return -1;
			} else if (this.y>p.y){
				return 1;
			}
			else {
				return 0;
			}
			
		}
	}
	
	
}


public class _3TreeSet {

	public static void main(String[] args) {
//		TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40)); //sorted set, take log n time
//		 ts.add(25);
//		 System.out.println(ts);
		
		
		TreeSet<Point> ts = new TreeSet<>();
		
		ts.add(new Point(1,1));
		ts.add(new Point(5,5));
		ts.add(new Point(5,2));
		
		System.out.println(ts);
	}

}
