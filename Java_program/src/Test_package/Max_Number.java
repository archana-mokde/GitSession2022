package Test_package;

import java.util.Scanner;

public class Max_Number {

	public static void main(String[] args) {
		int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		System.out.println("Enter third number");
		z=sc.nextInt();
		if(x>y && x>z) 
		{
			System.out.println( x +"  is greater number");
		}
		else if(y>x &&y>z)
		{
			System.out.println( y + "  is greater number");
		}
		else
		{
			System.out.println(z +"  is greater number");
		}
		sc.close();
	}

}
