package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class _1ListDemoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al1 =new ArrayList<>(20);
		
		ArrayList<Integer> al2 =new ArrayList<>(List.of(50,90,70,80,90,80,90));
		
		al1.add(10);
		al1.add(0, 5);
		al1.addAll(1,al2);
		
		System.out.println(al1.contains(50));
		System.out.println(al1.get(5));
		System.out.println(al1.indexOf(70));
		System.out.println(al1.lastIndexOf(90));//Returns the index of the last occurrence of the specified elementin this list
		al1.set(4, 100);
		System.out.println(al1);
		
//		for (int i = 0; i < al1.size(); i++) {
//			System.out.println(al1.get(i));
//		}
		
		
		
//		for (var x : al1) {
//			System.out.println(x);
//		}
		
		
//		Iterator<Integer> it=al1.iterator();//allow only forward move
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		
//		ListIterator<Integer> it=al1.listIterator(); //allow bidirectional move
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		//converting into for loop
		
//		for(ListIterator<Integer> it=al1.listIterator();it.hasNext();) //allow bidirectional move
//		{
//			System.out.println(it.next());
//		}
		
		
//		for (Iterator iterator = al1.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			System.out.println(integer);
//		}
		
		
//		al1.forEach(n->System.out.println(n));//n will become parameter every element will become n
		
//		al1.forEach(System.out::println);
		
		
		al1.forEach(n->show(n));
		 
	
	}
    
	static void show(int n) {
		if(n>60)
			System.out.println(n);
	}
}
