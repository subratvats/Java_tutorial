package collection_framework;

import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}

public class _9Array_and_Comparator {

	public static void main(String[] args) {
		
		 int a[]={2,4,6,8,1,3,5,7};
		 int b[]={2,4,6,8,1,3,5,7};
//		 System.out.println(Arrays.compare(a, b));
		 
//		 int c[] =Arrays.copyOf(a, a.length);
//		 Arrays.fill(c, 10);//initialize entire array  with 0
//		 for (int x:c) {
//			System.out.println(x);
//		}
		 
		 int d[] =Arrays.copyOf(a, a.length);
		 Arrays.sort(d);
		 for (int x:d) {
				System.out.println(x);
			}
		 System.out.println("after search found at index "+Arrays.binarySearch(d, 5));
		 //binary searching can be done on sorted array only
		 
		 
		 
		 Integer e[]={2,4,6,8,1,3,5,7};
	        Arrays.sort(e, new My());
	        
	       for(Integer x:e) 
	            System.out.println(x);

	}

}
