package java_basics;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("May I know your Name: ");
        name=sc.nextLine();
        sc.close();
        System.out.println("Welcome "+name);
        

	}

}
