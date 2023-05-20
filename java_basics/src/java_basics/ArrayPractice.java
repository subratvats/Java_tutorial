package java_basics;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
//		int A[] = new int[10];
//		int B[] = {1,2,3,4,5,6};
//		int [] D = new int[5];
//		int C[];
//		C=new int[5];
//		B[2] = 15;
//		for (int i = 0; i < B.length; i++) {
//			System.out.println(B[i]);
//		}

		int A[] = new int[5];
		System.out.println("Enter the Number in the array");
    	Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < A.length; i++) {
    		A[i] = sc.nextInt();
			
		}
	    sc.close();
//	    int sum =0;
//	    for (int i = 0; i < A.length; i++) {
//	    	sum = sum + A[i];
//	    	
//		}
//	    System.out.print(sum);
	    
	    
	    
	    //to find max no in an araay
//	    int max= A[0];
//	    for (int i = 0; i < A.length; i++) {
//	    	if (A[i]>max) {
//				max= A[i];
//			}	    	
//		}
//	    System.out.println("the max no is "+ max);
	    
	   
	    
	    
//	    int max1,max2;
//	    max1=max2=A[0];
//	    for (int i = 0; i < A.length; i++) {
//	    	if (A[i]>max1) {
//				max2=max1;
//				max1=A[i];
//			}	    	
//		}
//	    System.out.println("the 2nd max no is "+ max2);
	    
	    
	    
	    //rotation of an Array
	    
//	    for (int i = 0; i < A.length; i++) {
//	    	System.out.print(A[i]+" ");	    	
//	}System.out.println("");
//	    int temp = A[0];
//	    for (int i = 1; i < A.length; i++) {
//	    	A[i-1]=A[i];  
//	}
//	    A[A.length-1]= temp;
//	    for (int i = 0; i < A.length; i++) {
//	    	System.out.print(A[i]+" ");
//	}
	    
	    
	    //Insert(make sure you hhave extra space) in an array and delete can be done similar to above
	    
	    
	  
 	    //copying an array
//	    int B[] = new int[5];
//	    for (int i = 0; i < A.length; i++) {
//			
//				B[i]=A[i];
//			
//		}
//	    for (int i = 0; i < B.length; i++) {
//			System.out.println(B[i]);
//		}
	    
	    
	    
	    
//	    //reverse copying an array
//	    int B[] = new int[5];
//	    for (int i = A.length-1,j=0; i >=0; i--,j++) {			
//			B[j]=A[i];
//		}
//	    for (int i = 0; i < B.length; i++) {
//			System.out.println(B[i]);
//		}
	    
	    
	    
//	    //Increasing size of an array
//	    int B[] = new int[2*A.length];
//	    System.out.println(A.length);
//	    for (int i = 0; i < A.length; i++) {
//				B[i]=A[i];
//		}
//	    A=B;
//	    B=null;	    
//	    System.out.println(A.length);
//	    for (int i = 0; i < A.length; i++) {
//			System.out.println(A[i]);
//		}
	    
	    
	    
	    
	    
	}

}
