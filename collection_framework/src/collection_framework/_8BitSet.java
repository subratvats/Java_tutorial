package collection_framework;

import java.util.BitSet;

public class _8BitSet {

	public static void main(String[] args) {

        BitSet bs1=new BitSet();
        
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);
           
        BitSet bs2=new BitSet();
       // bs2.set(0);
        bs2.set(1);
       // bs2.set(2);
        bs2.set(3);
       // bs2.set(4);
        bs2.set(5);
       // bs2.set(6);
        bs2.set(7);
       // bs2.set(8);
        
//        bs1.and(bs2);//zero
//        bs1.or(bs2);//0 to 8
        
        bs1.flip(0,bs1.length());//{1, 3, 5, 7}
        System.out.println(bs1);
	}

}
