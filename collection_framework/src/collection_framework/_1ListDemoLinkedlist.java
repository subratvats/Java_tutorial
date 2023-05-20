package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//for linklist all the method from array list are suppported but few extra as well

public class _1ListDemoLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> al1 =new LinkedList<>();

		LinkedList<Integer> al2 =new LinkedList<>(List.of(50,90,70,80,90,80,90));


		al1.add(10);
		al1.add(0, 5);
		al1.addAll(1,al2);
 
		al1.addFirst(1000);
		al1.addLast(2000);
		System.out.println(al1.contains(50));
		System.out.println(al1.get(3));
		System.out.println(al1.indexOf(70));

		al1.forEach(n->show(n));


	}

	static void show(int n) {
//		if(n>60)
			System.out.println(n);
	}
}