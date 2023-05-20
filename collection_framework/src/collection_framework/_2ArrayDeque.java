package collection_framework;

import java.util.ArrayDeque;
//poll mean remove and offer means add 
public class _2ArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.offerLast(11);  //inserted in constant time
		dq.offerLast(20);
		dq.offerLast(30);
		dq.offerLast(40);
		
		dq.pollLast(); //inserting from last and removing from last means stack  
		dq.pollFirst();//inserting from last and removing from first means queue LIFO
		
		dq.offerFirst(1);
		dq.offerFirst(2);
		dq.offerFirst(3);
		dq.offerFirst(4);
		
		
		dq.forEach((x)->System.out.println(x));
	}

}
