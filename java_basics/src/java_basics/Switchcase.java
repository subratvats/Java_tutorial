package java_basics;

import java.util.Scanner;

public class Switchcase {
	  public static void main(String[] args) {
	    int day;
	    System.out.println("Enter the no of day in DIgit!");
	    Scanner sc = new Scanner(System.in);
	    day = sc.nextInt();
	    sc.close();
	    switch (day) {
	      case 1:
	        System.out.println("Monday");
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      case 7:
	        System.out.println("Sunday");
	        break;
	    }
	  }
	}
