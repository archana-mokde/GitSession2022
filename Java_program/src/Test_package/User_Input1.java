package Test_package;

import java.util.Scanner;

public class User_Input1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:- ");
		String my_name=sc.nextLine();
		System.out.println("My name is:- " + my_name);



		int a;

		int b;
		int result;
        Scanner sc1=new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("enter the first number:- " +a);
		System.out.println("enter the second number:- " +b);
		result=a+b;
		System.out.println("addition of a and b is:- " + result);
	}

}
