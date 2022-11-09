package Test_package;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		int b;
		int result;
		
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("enter the first number:- " +a);
		System.out.println("enter the second number:- " +b);
		result=a+b;
		System.out.println("addition of a and b is:- " + result);
		

	}

}
