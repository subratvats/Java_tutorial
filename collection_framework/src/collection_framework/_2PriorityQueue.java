package collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;

//value small-> priority high and hieghtest priority will be deleted
//	  large->priority low
//bydefault its a MIN Heap to make a Max heap use comparator interda

class MyCom implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2) return -1;
        return 0;
    }
}
public class _2PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>(new MyCom());
		
		p.add(20);
		p.add(30);
		p.add(3);
		p.add(8);
		p.add(9);
		p.add(1);
		p.add(15);
		
		System.out.println(p.peek());
		
		System.out.println("before deletion");
		p.forEach((x)->System.out.println(x));
		
		p.poll();
		System.out.println("After deletion");
		p.forEach((x)->System.out.println(x));
		
	}

}
