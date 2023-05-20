package collection_framework;

import java.util.HashSet;

// Java is using hashing technique in many of the classes like 
//HashSet takes  value
//HashMap  takes key as well as value
//LinkedHashSet
//LinkedHashMap
//HashTable
//properties
//for implementing hashing technique.we require a hash table.
//two types of hashing open addresing and chaining 
public class _3HashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs =new HashSet<>(20,0.75f);
		
		hs.add(20);
		hs.add(30);
		hs.add(30);
		hs.add(8);
		hs.add(25);
		hs.add(20);
		
		System.out.println(hs);

	}

}
