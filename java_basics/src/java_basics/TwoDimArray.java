package java_basics;

import java.util.Iterator;

public class TwoDimArray {

	public static void main(String[] args) {
//		int A [][] = new int[3][4];
//		int B [][] = {{1,2,3,4},{2,4,6,8},{3,5,7,9}};
//		int C [][];
//		C =new int[3][4];

//		for (int i = 0; i < B.length; i++) {
//			for (int j = 0; j < B[0].length; j++) {
//				System.out.print(B[i][j]);
//			}
//			System.out.println("");
//		}

		// using for each loop
//		for(int x[] : B) { // x will be taking reference to an array
//			for (int y : x) {    //y will be taking element from that array	
//				System.out.print(y);
//			}
//			System.out.println("");
//		}

//		int [] E, F[];
//		E=new int[5];
//		F=new int[5][5];

		// Jagged array

//		int X[][];
//		X=new int[3][];
//		X[0]=new int[5];
//		X[1]=new int[3];
//		X[2]=new int[8];
//		
//		for (int i = 0; i < X.length; i++) {
//			for (int j = 0; j < X[i].length; j++) {
//				System.out.print(X[i][j]+" ");
//			}
//			System.out.println("");
//		}

		// Matrix ADD and Multiply

		int A[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 5, 7 } };
		int B[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int C[][] = new int[3][3];
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				C[i][j] = A[i][j]+B[i][j];
//			}
//		}
//		for (int i = 0; i < 3; i++) {
//			for (int k = 0; k < 3; k++) {
//				System.out.print(C[i][k]+"  ");
//			}
//			System.out.println("");
//		}

//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				C[i][j] =0;
//				for (int k = 0; k < C.length; k++) {
//					C[i][j] =C[i][j] +A[i][k]*B[k][j];
//				}
//			}
//		}
//		for (int[] x : C) {
//			for (int y : x) {
//				System.out.print(y+" ");
//			}
//			System.out.println("");
//		}

	}

}
