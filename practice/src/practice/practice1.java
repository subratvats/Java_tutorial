package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) throws Exception{

		//ATM code n is amount to withdraw multiple of 5 f is initial amount
		//				        Scanner sc =new Scanner(System.in);
		//				        String[] in = sc.nextLine().split(" ");
		//		        float n = Float.parseFloat(in[0]);
		//		        float f = Float.parseFloat(in[1]);
		//		        if(n%5==0 && f>=n+0.5f)
		//			        System.out.println(f-n-0.5f);
		//			        
		//			        else{
		//			            System.out.println(f);
		//			            
		//			            
		//			        }


		//		InputStreamReader i = new InputStreamReader(System.in);
		//		BufferedReader bf = new BufferedReader(i);
		//		String[] in = bf.readLine().split(" ");
		//		float n = Float.parseFloat(in[0]);
		//		float f = Float.parseFloat(in[1]);
		//
		//		if(n%5==0 && f>=n+0.5f)
		//			System.out.println(f-n-0.5f);
		//
		//		else{
		//			System.out.println(f);
		//		}



//	Scanner sc =new Scanner(System.in);
//	int t=sc.nextInt();
//			while(t-- >0){
//
//				InputStreamReader i = new InputStreamReader(System.in);
//				BufferedReader bf = new BufferedReader(i);
//				String[] in = bf.readLine().split(" ");
//				int n = Integer.parseInt(in[0]);
//				int f = Integer.parseInt(in[1]);
//				if (n>=f){
//					System.out.println("YES");
//				} 
//				else{
//					System.out.println("NO");
//				} 
//
//			}
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x>=y){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}

