package collection_framework;

import java.util.*;
import java.util.Map.Entry;
import java.util.TreeMap;

public class _4treeMap_Hash_LinkedHashMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm =new TreeMap<>(Map.of(0,"A",1,"B",3,"C",4,"D"));//are sorted
		
		tm.put(2, "E");
		tm.put(6, "F");
		
		
		Entry<Integer, String> e = tm.firstEntry();
		
		System.out.println(e.getKey()+" "+e.getValue());
		
		System.out.println("Value on key 5 is "+tm.ceilingEntry(5).getValue());//if nothing on 5 checks next else throws exception 
		System.out.println("value at key no 3 is "+ tm.get(3));
		System.out.println(tm);
		
		
		System.out.println("//--------------------//");
		
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(51,"E");
		hm.put(1,"A");
		hm.put(4, "D");
		hm.put(2, "B");
		hm.put(3,"C");
		hm.put(6,"A");
		System.out.println(hm);
		
		
			//if only limit the size by 5 keys only then need to override inside LinkedHashMap class
		//if true it is order by access
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,.75f,true) {
        	protected boolean removeEldestEntry(Map.Entry e) {
				return size()>5;
			}
        };
        
        System.out.println("//--------------------//");
        
        lhm.put(5,"E");
        lhm.put(1,"A");
        lhm.put(4,"D");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(6,"A");
        lhm.put(9,"C");
        lhm.put(8,"A");
//        System.out.println(lhm);
//        System.out.println(lhm.get(5));
////        String s=lhm.get(5);
//        lhm.put(4,"K");
        System.out.println(lhm.get(1));
        lhm.forEach((k,v)->System.out.println(k+": "+v));//order is maintained
	}

}
