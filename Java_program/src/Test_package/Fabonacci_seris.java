package Test_package;

import java.util.Scanner;

public class Fabonacci_seris {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		int num1=0;
		int num2=1;
		int num3;
		for(int i=0;i<= num;i++)
		{
			System.out.println(num1+" ");
			num3=num1;
			num1=num2;
			num2=num1+num3;
			
			
			
		}

	}

}
